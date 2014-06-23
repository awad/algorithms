package com.trees.model;

public class LinkedListNode {
	LinkedListNode next = null;
	int data;
	
	LinkedListNode(int data)
	{
		this.data = data;
	}
	
	void appendToTail(LinkedListNode end)
	{
		LinkedListNode n = this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next = end;
	}

}
