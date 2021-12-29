package com.stack;

import com.linkedlist.Mylinkedlist;

public class Queue {
	public static void main(String[] args) {
		Mylinkedlist mylinkedlist = new Mylinkedlist();
		mylinkedlist.addLast(56);
		mylinkedlist.print();
		mylinkedlist.addLast(30);
		mylinkedlist.print();
		mylinkedlist.addLast(70);
		mylinkedlist.print();
		mylinkedlist.deleteFirst();
		mylinkedlist.print();
		mylinkedlist.deleteFirst();
		mylinkedlist.print();
	}
}
