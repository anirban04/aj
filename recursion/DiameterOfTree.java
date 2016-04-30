package recursion;
import java.util.*;

public class DiameterOfTree {

	public static void main (String[] args) {
		Tree tr = new Tree();
		tr.add(null, 0);
		Node temp = tr.add(tr.root, 5);
		tr.add(temp, 200);
		tr.add(temp, 7);
		temp = tr.add(tr.root, 5);
		tr.add(temp, 9);
		tr.add(temp, 8);
		temp = tr.add(tr.root, 5);
		tr.add(temp, 100);
		tr.add(temp, 209);
		System.out.println("The tree looks like: ");
		tr.printTree();

		System.out.println("Diameter of this tree is " + tr.getDia());
		
	}
}

class Node {
	
	int weight;
	List<Node> children;
	
	public Node(int val) {
		this.weight = val;
		children = new ArrayList<Node>();
	}
	
	public void printNode() {
		System.out.println(weight);
	}
}

class Tree {
	Node root;

	
	public Node add(Node parent, int val) {
		Node n = new Node(val);
		
		if (parent == null)
			root = n;
		else
			parent.children.add(n);
		return n;
	}
	
	public void printTree() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node n = q.remove();
			n.printNode();
			for (Node child : n.children)
				q.add(child);
		}
	}
	
	public int getDia() {
		return _getDia(root).dia;
	}
	
	private Res _getDia(Node n) {
		
		if (n.children.isEmpty()) {
			return new Res(0, 0);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return -i1.compareTo(i2);
			}
		});
		int maxDia = 0;

		for (Node child : n.children) {
			Res res = _getDia(child);
			pq.add(res.maxChild + child.weight);
			if (maxDia < res.dia)
				maxDia = res.dia;
		}
		
		int d1 = pq.remove();
		int d2 = pq.remove();
		int temp = d1 + d2;
		
		if (maxDia < temp)
			maxDia = temp;
		
		return new Res(maxDia, d1);
	}

class Res { 
	int dia;
	int maxChild;
	
	public Res(int dia, int maxChild) {
		this.dia = dia;
		this.maxChild = maxChild;
	}
}
}

