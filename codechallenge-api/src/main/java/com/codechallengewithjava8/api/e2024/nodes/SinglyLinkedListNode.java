package com.codechallengewithjava8.api.e2024.nodes;

public class SinglyLinkedListNode {
	
	protected int data;
	protected SinglyLinkedListNode next;
	
	public SinglyLinkedListNode() {
	}
	
	// constructor to insert at the end
	public SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}

	// constructor to insert at the beginning
	public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SinglyLinkedListNode getNext() {
		return next;
	}

	public void setNext(SinglyLinkedListNode next) {
		this.next = next;
	}
		
}
