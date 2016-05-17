package trees;
import java.io.*;
import java.util.*;

public class AllTreeAlgos {

	public static void main(String args[]) throws Exception {

		BinaryTree bt = new BinaryTree();
		TreeNode n = bt.add(7, null);
		TreeNode n1 = bt.add(3, n);
		TreeNode n2 = bt.add(11, n);
		bt.add(1, n1);
		bt.add(5, n1);
		bt.add(9, n2);
		bt.add(13, n2);
		bt.printTree(n);
		
		BinaryTree bt2 = new BinaryTree();
		n = bt2.add(8, null);
		n1 = bt2.add(4, n);
		n2 = bt2.add(12, n);
		bt2.add(2, n1);
		bt2.add(6, n1);
		bt2.add(10, n2);
		bt2.add(14, n2);
		bt2.printTree(n);
		
		//bt.printTree(n);
		//System.out.println("Is BST: " + bt.isBst());
		//bt.reverseTree();
		//bt.clone();
		//bt.printTree(bt.clone());
		//bt.printAllPaths();
		mergeBST(bt, bt2);
		//Dll lst = bt.treeToList();
		//lst.printList();
		//int[] inOrder = {4 ,2 ,5 ,1 ,6 ,7 ,3 ,8};
		//int[] preOrder = {1, 2, 4, 5, 3 ,7 ,6 ,8};
		//rebuildTree(inOrder, preOrder); //Also Prints it line by line
		
		BinaryTree bt3 = new BinaryTree();
		n = bt3.add(10, null);
		n1 = bt2.add(5, n);
		n2 = bt2.add(15, n);
		bt2.add(1, n1);
		bt2.add(8, n1);
		bt2.add(7, n2);
		bt2.add(14, n2);
		//System.out.println(getMaxBSTSubtree(n).val);
		//System.out.println(getMaxBST(n).val);
		
	}

	
	
	
	
//================================================================================================	
	//Get max sized BST Subtree for the tree who's root is n
	private static TreeNode getMaxBSTSubtree(TreeNode node) {
		return _getMaxBSTSubtree(node).n;
	}
	
	private static MaxBSTSubtree _getMaxBSTSubtree(TreeNode n) {
		
		if (n.left == null && n.right == null)
			return new MaxBSTSubtree(true, 1, n);
		
		MaxBSTSubtree lRes, rRes;
		
		if (n.left != null)
			lRes = _getMaxBSTSubtree(n.left);
		else
			lRes = new MaxBSTSubtree(true, 0, null);
		
		if (n.right != null)
			rRes = _getMaxBSTSubtree(n.right);
		else
			rRes = new MaxBSTSubtree(true, 0, null);
		
		if (((n.left == null) || (n.left != null && n.val > n.left.val)) &&
		   ((n.right == null) || (n.right != null && n.val < n.right.val)) &&
		   (lRes.isBST) && (rRes.isBST))
			return new MaxBSTSubtree(true, 1 + lRes.max + rRes.max, n);
		else if(lRes.max >= rRes.max) {
			if (lRes.isBST)
				return new MaxBSTSubtree(false, lRes.max, n.left);
			else
				return new MaxBSTSubtree(false, lRes.max, lRes.n);
		}
		else {
			if (rRes.isBST)
				return new MaxBSTSubtree(false, rRes.max, n.right);
			else
				return new MaxBSTSubtree(false, rRes.max, rRes.n);
		}
	}


	
	
	
//================================================================================================
	//Get max sized BST for the tree who's root is n. Note that all sub nodes 
	//in the max sized BST need not be part of the Max Sized BST. That is how 
	//this question differs from the max sized BST Subtree. In that case all
	//nodes in the subtree need to be part of that BST subtree.
	private static TreeNode getMaxBST(TreeNode node) {
		return _getMaxBST(node).n;
	}
	
	private static MaxBSTSubtree _getMaxBST(TreeNode n) {
		
		if (n.left == null && n.right == null)
			return new MaxBSTSubtree(true, 1, n);
		
		MaxBSTSubtree lRes, rRes;
		
		if (n.left != null)
			lRes = _getMaxBSTSubtree(n.left);
		else
			lRes = new MaxBSTSubtree(true, 0, null);
		
		if (n.right != null)
			rRes = _getMaxBSTSubtree(n.right);
		else
			rRes = new MaxBSTSubtree(true, 0, null);
		
		int maxSize = 0;
		boolean meBST = false;
		
		if (lRes.isBST) {
			maxSize+=lRes.max;
			meBST = true;
		}

		if (rRes.isBST) {
			maxSize+=rRes.max;
			meBST = true;
		}
			
		
		if (meBST)
				return new MaxBSTSubtree(meBST, 1 + maxSize, n);
		else {
			if (lRes.max > rRes.max)
				return new MaxBSTSubtree(false, lRes.max, lRes.n);
			else
				return new MaxBSTSubtree(false, rRes.max, rRes.n);
		}
		
		
		
	}
	
	
	
	
	
//================================================================================================
	//rebuild a tree from In-order and Pre-order traversal arrays
	public static void rebuildTree(int[] inOrder, int[] preOrder) {
		printLevelByLevel(_rebuild_tree(inOrder, preOrder, 0, 
									   inOrder.length - 1, 0, 
									   preOrder.length - 1));
	}
	
	private static TreeNode _rebuild_tree(int[] inOrder, int[] preOrder, 
								   int iLow, int iHigh, 
								   int pLow, int pHigh) {

		if (iHigh < iLow || pHigh <	pLow)
			return null;

		TreeNode node = new TreeNode(preOrder[pLow]);
		int idx = search(inOrder, preOrder[pLow], iLow, iHigh);
		
		int iLowLeft = iLow;
		int iHighLeft = idx - 1;
		int iLowRight = idx + 1; 
		int iHighRight = iHigh;
		
		int pLowLeft = pLow + 1;
		int pHighLeft = pLowLeft + (iHighLeft - iLowLeft);
		int pLowRight = pHighLeft + 1;
		int pHighRight = pHigh;
		
		node.left = _rebuild_tree(inOrder, preOrder, iLowLeft, iHighLeft, pLowLeft, pHighLeft);
		node.right = _rebuild_tree(inOrder, preOrder, iLowRight, iHighRight, pLowRight, pHighRight);
	
		return node;
	}
	
	private static int search(int[] arr, int n, int low, int high) {
		for (int i = low; i <= high; i++) {
			if (arr[i] == n)
				return i;
		}
		return -1;
	}
	
		
	
	
	
//================================================================================================
	//Merge 2 binary trees
	public static void mergeBST(BinaryTree tree1, BinaryTree tree2) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		_populateList(l1, tree1.root);
		_populateList(l2, tree2.root);
		
		//merge lists
		List<Integer> res = mergeLists(l1, l2);
		
		//create result tree and print level by level
		printLevelByLevel(buildTree(res, 0, res.size() - 1));
	}
	
	private static void printLevelByLevel(TreeNode root) {
		List<List<Integer>> lst = new ArrayList<List<Integer>>();
		_populateLevelByLevel(root, lst, 0);
		for (List<Integer> subLst : lst) {
			System.out.println(subLst);
		}
	}

	private static void _populateLevelByLevel(TreeNode node, List<List<Integer>> lst, int idx) {
		if (node == null)
			return;
		
		if (idx > lst.size() - 1)
			lst.add(new ArrayList<Integer>());
		
		lst.get(idx).add(node.val);
		
		_populateLevelByLevel(node.left, lst, idx + 1);
		_populateLevelByLevel(node.right, lst, idx + 1);
	}
	
	private static TreeNode buildTree(List<Integer> res, int low, int high) {
		if (low > high)
			return null;
		if (low == high)
			return new TreeNode(res.get(low));
		
		int mid = low + ((high - low) / 2);
		TreeNode node = new TreeNode(res.get(mid));
		node.left = buildTree(res, low, mid - 1);
		node.right = buildTree(res, mid + 1, high);
		
		return node;
			
	}
	
	private static void _populateList(List<Integer> l1, TreeNode node) {
		
		if (node == null)
			return;
		
		_populateList(l1, node.left);
		l1.add(node.val);
		_populateList(l1, node.right);
	}
	
	private static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2) {
		List<Integer> res = new ArrayList<Integer>();
		
		while(!l1.isEmpty() || !l2.isEmpty()) {
			while(!l1.isEmpty() && !l2.isEmpty()) {
				if (l1.get(0) < l2.get(0))
					res.add(l1.remove(0));
				else
					res.add(l2.remove(0));
			}
			
			while (!l1.isEmpty())
				res.add(l1.remove(0));
			
			while (!l2.isEmpty())
				res.add(l2.remove(0));
		}
		return res;
	}

}

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}
	
	public void printNode() {
		System.out.print(" " + this.val + " ");
	}
}

class BinaryTree {

	TreeNode root;

	public TreeNode add(int val, TreeNode parent) {

		if (root == null) {
			root = new TreeNode(val);
			return root;
		}
		else if (parent.left == null) {
			parent.left = new TreeNode(val);
			return parent.left;
		}
			else if (parent.right == null) {
				parent.right = new TreeNode(val);
				return parent.right;
		}
		else
			System.out.println("Cannot add " + val + " as child of " + parent.val);
		return null;
	}
	
    public void printTree (TreeNode node) {
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.add(node);
        while(!q.isEmpty()) {
        	TreeNode n = q.remove();
            if (n!= null) {
                n.printNode();
                q.add(n.left);
                q.add(n.right);
            }
        }
        System.out.println();
    }

    

    
//================================================================================================	
  	//Check if a binary tree is a BST
	public boolean isBst() {
		return _isBst(root, Integer.MIN_VALUE, 
							Integer.MAX_VALUE, 
							false, false);
	}

	private boolean _isBst(TreeNode n, int min, int max, 
			boolean visitedMinVal, boolean visitedMaxVal) {
        
        if (n == null)
            return true;
            
        if ((n.val == Integer.MIN_VALUE && visitedMinVal) ||
        	(n.val == Integer.MAX_VALUE && visitedMaxVal))
            return false;

        if (n.val == Integer.MIN_VALUE)
            visitedMinVal = true;
        
        if (n.val == Integer.MAX_VALUE)
            visitedMaxVal = true;
        
        if (n.val > max || n.val < min)
            return false;

        int newMax, newMin;
        
        if (n.val == Integer.MIN_VALUE)
            newMax = Integer.MIN_VALUE;
        else
            newMax = n.val - 1;
            
        if (n.val == Integer.MAX_VALUE)
            newMin = Integer.MAX_VALUE;
        else
            newMin = n.val + 1;
        
        return (_isBst(n.left, min, newMax, visitedMinVal, 
        									visitedMaxVal) &&
                _isBst(n.right, newMin, max, visitedMinVal, 
                							 visitedMaxVal));
    }
	


	
//================================================================================================
	//Print all paths in a tree
	public void printAllPaths() {
		Stack<Integer> stk = new Stack<Integer>();
		_printAllPaths(root, stk);
	}
	
	//Print all paths in a tree
	private void _printAllPaths(TreeNode n, Stack<Integer> stk) {
		if (n.left == null && n.right == null) {
			stk.push(n.val);
			System.out.println(stk);
			stk.pop();
			return; 
		}
		
		stk.push(n.val);
		
		if (n.left != null)
			_printAllPaths(n.left, stk);
		if (n.right != null)
			_printAllPaths(n.right, stk);
		
		stk.pop();
	}
	
	public void reverseTree() {
		_reverseTree(root);
	}
	
	//Reverse a tree
	private void _reverseTree(TreeNode node) {
		if (node.left == null && node.right == null)
			return;
		
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		if (node.left != null)
			_reverseTree(node.left);
		if (node.right != null)
		_reverseTree(node.right);
		
	}


	

//================================================================================================
	//Clone a binary tree
	public TreeNode clone() {
		if (root == null)
			return null;

		TreeNode cloneRoot = new TreeNode(root.val);
		_clone(cloneRoot, root);
		return cloneRoot;
	}
	
	private void _clone(TreeNode clone, TreeNode node) {
		if (node.left == null && node.right == null)
			return;
		
		if (node.left != null) {
			clone.left = new TreeNode(node.left.val);
			_clone(clone.left, node.left);
		}
		if (node.right != null) {
			clone.right = new TreeNode(node.right.val);
			_clone(clone.right, node.right);
		}	
	}


	

	
//================================================================================================	
	//Convert a BST to an ordered circular Doubly linked list
	public Dll treeToList() {
		Dll circDll = new Dll();
		 _treeToList(root, circDll);
		 return circDll;
	}
	
	private void _treeToList(TreeNode node, Dll list) {
		
		if (node.left != null)
			_treeToList(node.left, list);
		
		//save the right pointer since we will destroy it while adding to list
		TreeNode tempRt = node.right;
		list.addToTail(node);
		
		if (tempRt != null)
			_treeToList(tempRt, list);
	}
//================================================================================================
}

class Dll {
	TreeNode head;
	TreeNode tail;
	
	public void addToTail(TreeNode node) {
		if (head == null) {
			head = node;
			tail = node;
			node.left = node;
			node.right = node;
		}
		else {
			node.left = tail;
			node.right = head;
			tail.right = node;
			head.left = node;
			
			tail = node;
		}
	}
	
	public void printList() {
		TreeNode cur = head;
		while(cur != tail) {
			System.out.print(cur.val + "->");
			cur = cur.right;
		}
		System.out.print(tail.val);
		System.out.println();
	}
}

class MaxBSTSubtree {
	
	boolean isBST;
	int max;
	TreeNode n;
	
	public MaxBSTSubtree(boolean isBST, int max, TreeNode n) {
		this.isBST = isBST;
		this.max = max;
		this.n = n;
	}
}

