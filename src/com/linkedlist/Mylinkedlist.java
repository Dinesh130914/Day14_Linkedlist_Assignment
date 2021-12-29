package com.linkedlist;

public class Mylinkedlist {
	Node head;

	public boolean addLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		while (temp.next != null) {

			temp = temp.next;
		}

		temp.next = newNode;


		return true;
	}

	public boolean addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		newNode.next = temp;
		head = newNode;

		return true;
	}

	public boolean deleteFirst()
	{
		Node temp=head;  
		head=temp.next;


		return true;
	}

	public boolean deleteLast() {

		if(head==null)
			return false;
		if(head.next == null)
		{
			head=null;
			return true;
		}

		Node temp=head;

		while(temp.next.next!=null)
		{
			temp=temp.next;
		}

		temp.next=null;

		return false;

	}
	public void print() {

		if (head == null) {
			System.out.println("No elements to show...");
			return;
		}

		Node temp = head;
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		while (temp != null) {

			if (temp.next != null)
				System.out.print(temp.data + " ===> ");
			else
				System.out.println(temp.data);

			temp = temp.next;
		}
	}

	public Node addbyindex(Node headnode,int pos,int data) 
	{
		Node head=headnode;

		if(pos<0) 
		{
			System.out.println("Invalid position");
		}

		if(pos==1) 
		{
			Node newnode = new Node(data);
			newnode.next=headnode;
			head=newnode;
		}else 
		{
			while(pos--!=0) {
				if(pos==1) 
				{
					Node newnode = new Node(data);
					newnode.next=headnode.next;
					headnode.next=newnode;
					break;
				}
				headnode=headnode.next;
			}
			if(pos!=1) 
			{
				System.out.println("Position out of range");
			}
		}

		return head;
	}

	public void sort() 
	{
		Node current = head,index = null;
		int temp;

		if(head == null) 
		{
			return;
		}
		else 
		{
			while(current!=null) 
			{
				index = current.next;
				while(index!=null) 
				{
					if(current.data>index.data)
					{
						temp=current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current=current.next;

			}
		}
	}

	public void search(int data) {
			if(head==null) 
			{
				return;
			}
			
			int index = 0;
			Node temp = head;
			while(temp!=null)
			{
				if(temp.data==data) 
				{
					return;
				}
				temp=temp.next;
				index++;
			}
			return;
	}
}
