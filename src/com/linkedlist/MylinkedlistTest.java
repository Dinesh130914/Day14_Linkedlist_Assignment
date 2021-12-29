package com.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MylinkedlistTest {

	@Test
	public void test() {
		Mylinkedlist mylinkedlist = new Mylinkedlist();
		mylinkedlist.addFirst(56);
		mylinkedlist.addFirst(30);
		mylinkedlist.addFirst(70);
		
		assertEquals(true,mylinkedlist.search(30));
	}

}
