package com.stack;

import com.linkedlist.Mylinkedlist;

public class Stack {
	public static void main(String[] args) {
		Mylinkedlist mylinkedlist = new Mylinkedlist();
		mylinkedlist.addFirst(70);
		mylinkedlist.print();
		mylinkedlist.addFirst(30);
		mylinkedlist.print();
		mylinkedlist.addFirst(56);
		mylinkedlist.print();
	}
}
