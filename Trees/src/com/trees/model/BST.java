package com.trees.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BST {
	TreeNode root;
	
	public BST(int data)
	{
		root = new TreeNode(data);
	}
	
	public void insert(TreeNode n)
	{
		insert(root, n);
	}
	
	private void insert (TreeNode root, TreeNode n)
	{	
		if(n.data < root.data)
		{
			if(root.left == null)
			{
				root.left = n;
				return;
			}
			insert(root.left, n);			
		}
		else
		{
			if(root.right == null)
			{
				root.right = n;
				return;
			}
			insert(root.right, n);	
		}
	}
	
	public void print()
	{
		TreeNode tmpRoot = root;
		Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
        Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();

        currentLevel.add(tmpRoot);

        while (!currentLevel.isEmpty()) {
            Iterator<TreeNode> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                TreeNode currentNode = iter.next();
                if (currentNode.left != null) {
                    nextLevel.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.add(currentNode.right);
                }
                System.out.print(currentNode.data + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<TreeNode>();
        }

	}
}
	
