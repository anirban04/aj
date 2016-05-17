package LinkedList;

public class App {
	public static void main(String[] args) {
		MyList<Integer> lst = new MyList<Integer>();
		//lst.addValToHead(6);
		//lst.addValToHead(5);
		//lst.addValToHead(4);
		//lst.addValToHead(3);
		lst.addValToHead(2);
		lst.addValToHead(1);
		lst.printList();
		lst.swapKth(3);
		lst.printList();
	}
}

class MyList<T> {
	Node <T> head;
	
	public void addNodeToHead(Node <T> newNode) {
		if (newNode == null)
				return;
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addValToHead(T val) {
		Node<T> newNode = new Node<T>(val);
		
		newNode.next = head;
		head =newNode;
	}
	
	public void printList() {
		Node<T> cur = head;
		System.out.print("\nList Contains - ");
		while(cur  != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public void reverseList() {
		Node<T> cur = head;
		Node<T> prev = null;
		
		while(cur != null) {
			Node<T> temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		head = prev;
	}
	
	public MyList<T> deepCopy() {
		
		if (head == null)
			return null;
			
		MyList<T> newLst = new MyList<T>();
		newLst.head = new Node<T> (head.val);
		Node<T> cur = head;
		Node<T> newCur = newLst.head;
		
		while(cur.next != null) {
			newCur.next = new Node<T>(cur.next.val);
			newCur = newCur.next;
			cur = cur.next;
		}
		
		return newLst;
	}
	//head is 0th position
	public void addToKthfromEnd(T val, int pos) {

			
		Node<T> cur = head;
		//Find the number of nodes in the list
		int totalNodes = 0;
		while(cur != null) {
			totalNodes++;
			cur = cur.next;
		}
		
		//position does not exist in the list
		if (pos > totalNodes)
			return;
		//Add to head
		else if(pos == totalNodes) {
			addValToHead(val);
			return;
		}
		
		//Compute the index of the previous node of the 
		//location where the new node is to be added.
		int prevIdx = totalNodes - pos - 1;
		cur = head;
		while(prevIdx > 0) {
			cur = cur.next;
			prevIdx--;
		}
		
		Node<T> newNode = new Node<T>(val);
		newNode.next = cur.next;
		cur.next = newNode;
	}
	
	public void zipList() {
		zipList(head);
	}
	
	public void zipList(Node<T> cur) {
		if (cur == null || cur.next == null || cur.next.next == null) 
			return;

		Node<T> lastParent = getLastParent(cur);
		Node<T> last = lastParent.next;
		lastParent.next = null;
		insert(cur, last);
		zipList(cur.next.next);
	}
	
	public void swapKth(int k) {
		head = swapKth(head, k);
	}
	
	private Node<T> swapKth(Node<T> head, int k) {
		int length = getLength(head);
		
		if (k > length || k < 1)
			return head;
		//Get prev pointers for both nodes
		Node<T> p1 = getPrev(head, k);
		Node<T> p2 = getPrev(head, length - k + 1);
		
		if (p1 == p2)
			return head;
		
		//Make sure p1 is always before p2 in the list
		if (k > length / 2) {
			Node<T> temp = p1;
			p1 = p2;
			p2 = temp;
		}
		
		
		if (p1 == null) {
			// Helper to swap head and tail. Also 
			// considers if head and tail are adjacent
			return swapHeadTail(head, p2);
		}
		else {
			// Helper to swap 2 nodes that are not head and
			// tail pair. Also considers if nodes are adjacent.
			swapNodes(p1, p2);
			return head;
		}
	}
	
	private void swapNodes(Node<T> p1, Node<T> p2) {
		if (p1.next == p2) {
			p1.next = p2.next;
			p2.next = p1.next.next;
			p1.next.next = p2;
		}
		else {
			Node<T> n1 = p1.next;
			Node<T> n2 = p2.next;
			
			//Unlink both nodes
			p1.next = n1.next;
			n1.next = null;
			p2.next = n2.next;
			n2.next = null;
			
			//Link them back in at the new positions
			n1.next = p2.next;
			p2.next = n1;
			n2.next = p1.next;
			p1.next = n2;
		}
	}
	
	private Node<T> swapHeadTail(Node<T> head, Node<T> pTail) {
		if (head == pTail) {
			head = head.next;
			pTail.next = null;
			head.next = pTail;
			return head;
		}
		else {
			Node<T> tail = pTail.next;
			Node<T> nHead = head.next;
			
			//Unlink both node
			pTail.next = null;
			head.next = null;
			
			//Link them back in at the new positions
			tail.next = nHead;
			pTail.next = head;
			return tail;
		}
	}
	
	private Node<T> getPrev(Node<T> head, int k) {
		k--;//since we want prev of the Node
		if (k == 0)
			return null;
		while(k > 1) {
			head = head.next;
			k--;
		}
		return head;
	}
	
	private int getLength(Node<T> head) {
		int cnt = 0;
		while(head != null) {
			head = head.next;
			cnt++;
		}
		return cnt;
	}
	
	private Node <T> getLastParent(Node<T> cur) {
		while (cur != null && cur.next != null && cur.next.next != null)
			cur = cur.next;
		return cur;
	}
	
	private void insert(Node<T> cur, Node<T> node) {
		node.next = cur.next;
		cur.next = node;
	}
}

class Node<T> {
	T val;
	Node<T> next;
	
	public Node(T val) {
		this.val = val;
	}
}
