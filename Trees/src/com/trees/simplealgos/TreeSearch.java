package com.trees.simplealgos;

import com.trees.model.BST;
import com.trees.model.TreeNode;

public class TreeSearch {

	public static void main(String [] args)
	{
	BST tree = new BST(10);
	
	tree.insert(new TreeNode(8));
	tree.insert(new TreeNode(7));
	tree.insert(new TreeNode(42));
	tree.insert(new TreeNode(12));
	tree.insert(new TreeNode(23));
	
	tree.print();
	}
	
}
