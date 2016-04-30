package recursion;
/* A unival MyTree is one where the values of all Nodes including the root is
 * same. Given a Tree, return the number of unival subTrees in it. Note: a 
 * Tree is considered a subTree of itself. */

import java.util.*;

public class NumUnivalSubtrees {

	public static void main (String[] args) {
		MyTree tr = new MyTree();
		MyNode tmp = tr.add(null, 5);
		MyNode tmp1 = tr.add(tmp, 5);
		MyNode tmp2 = tr.add(tmp, 4);
		tr.add(tmp1, 5);
		tr.add(tmp1, 5);
		tr.add(tmp2, 4);
		tr.add(tmp2, 4);
		System.out.println("The MyTree looks like: ");
		tr.printMyTree();

		System.out.println("Number of uniVal subtrees is " + tr.getNumUnivalSubtrees());
	}

}
class MyNode {
	
	int val;
	MyNode left;
	MyNode right;
	
	public MyNode(int val) {
		this.val = val;
	}
	
	public void printMyNode() {
		System.out.println(val);
	}
}

class MyTree {
	MyNode root;

	
	public MyNode add(MyNode parent, int val) {
		MyNode n = new MyNode(val);
		
		if (parent == null)
			root = n;
		else if (parent.left == null)
			parent.left = n;
		else
			parent.right = n;
		return n;
	}
	
	public void printMyTree() {
		Queue<MyNode> q = new LinkedList<MyNode>();
		q.add(root);
		
		while(!q.isEmpty()) {
			MyNode n = q.remove();
			n.printMyNode();
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}
	
	public int getNumUnivalSubtrees() {
		return _getNumUnivalSubtrees(root).numUnivalSubtrees;
	}

	private Res _getNumUnivalSubtrees(MyNode n) {
		if (n.left == null && n.right == null)
			return new Res(1, true);

		Res lRes;
		Res rRes;
		
		if (n.left != null) {
			lRes = _getNumUnivalSubtrees(n.left);
		}
		else 
			lRes = new Res(0, true);
		
		if (n.right != null) {
			rRes = _getNumUnivalSubtrees(n.right);
		}
		else
			rRes = new Res(0, true);

		int myUnivalSubtreeCnt = lRes.numUnivalSubtrees + rRes.numUnivalSubtrees;
		boolean iUnival = false;

		if (n.left != null && n.right != null) {
			if (n.left.val == n.val && n.right.val == n.val &&
					lRes.isUnival && rRes.isUnival) {
				myUnivalSubtreeCnt++;
				iUnival = true;
			}
		}
		else if(n.left != null) {
			if (n.left.val == n.val && lRes.isUnival) {
				myUnivalSubtreeCnt++;
				iUnival = true;
			}
		}
		else { //n.right != null
			if (n.right.val == n.val && rRes.isUnival) {
				myUnivalSubtreeCnt++;
				iUnival = true;
			}
		}
		
		return new Res(myUnivalSubtreeCnt, iUnival);
		
	}

class Res {
	int numUnivalSubtrees;
	boolean isUnival;
	
	public Res (int numUnivalSubtrees, boolean isUnival) {
		this.numUnivalSubtrees = numUnivalSubtrees;
		this.isUnival = isUnival;
	}
}
}
