package com.linkedlist;

import java.util.LinkedList;

public class Runner {
	public static void main(String[] args)
	{
		Mylinkedlist mylinkedlist = new Mylinkedlist();
		
		mylinkedlist.print();
		mylinkedlist.addLast(56);
		mylinkedlist.print();
		mylinkedlist.addLast(70);
		mylinkedlist.print();
		mylinkedlist.addbyindex(mylinkedlist.head,2,30);
		mylinkedlist.print();
	
	}
}
