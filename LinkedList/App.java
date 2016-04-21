package LinkedList;

public class App {
	public static void main(String[] args) {
		MyList<Integer> lst = new MyList<Integer>();
		lst.addNodeToHead(new Node<Integer>(1));
		lst.addNodeToHead(new Node<Integer>(2));
		lst.addValToHead(3);
		lst.addValToHead(4);
		lst.addValToHead(5);
		//lst.printList();
		lst.reverseList();
		lst.printList();
		lst.addToKthfromEnd(6, 4);
		lst.printList();
		//MyList<Integer> copyLst = lst.deepCopy();
		//copyLst.printList();
		
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
}

class Node<T> {
	T val;
	Node<T> next;
	
	public Node(T val) {
		this.val = val;
	}
}
