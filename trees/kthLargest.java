package trees;

import java.util.*;
public class kthLargest {
public static void main(String args[] ) throws Exception {

        Btree bt = new Btree();
        bt.add(4);
        bt.add(2);
        bt.add(6);
        bt.add(1);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        System.out.println(bt.kthLargest(6));
    }
}

class Node {
    int val;
    Node left;
    Node right;
    
    public Node (int val) {
        this.val = val;
    }
    
    public void printNode() {
            System.out.println("n = " + this.val);
    }
}

class Btree {
    Node root;
    
    public void add(int val) {
        if (root == null)
            root = insert(null, val);
        else
            insert(root, val);
    }
    
    private Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        
        if (val < root.val)
            root.left = insert(root.left, val);
        if (val > root.val)
            root.right = insert(root.right, val);
        
        return root;
    }
    
    public void printTree () {
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node n = q.remove();
            if (n!= null) {
                n.printNode();
                q.add(n.left);
                q.add(n.right);
            }
        }
    }
    
    public int kthLargest(int k) {
    	Integer[] kArr = {0};
    	Node n = _kThLargest(root, kArr, k);
    	if (n == null)
    		return Integer.MAX_VALUE;
    	else return n.val;
    }
    
    private Node _kThLargest(Node n, Integer[] cnt, int k) {
    	//Do an in in-order traversal in reverse order
    	if (n == null)
    		return null;

    	Node kth = _kThLargest(n.right, cnt, k);
    	
    	if (kth == null) {
    		cnt[0] = cnt[0] + 1;
    		if (cnt[0] == k)
    			kth = n;
    	}
    	
    	if (kth == null) {
    		kth = _kThLargest(n.left, cnt, k);
    	}
    		
    	return kth;
    }
}
