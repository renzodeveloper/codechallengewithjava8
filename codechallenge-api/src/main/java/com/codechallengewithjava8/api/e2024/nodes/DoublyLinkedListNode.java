package com.codechallengewithjava8.api.e2024.nodes;

public class DoublyLinkedListNode {
	
	protected int data;
	protected DoublyLinkedListNode next, prev;
	
	public DoublyLinkedListNode() {
		data = 0;
		next = null;
		prev = null;
	}

	public DoublyLinkedListNode(int data, DoublyLinkedListNode next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedListNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

	public DoublyLinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyLinkedListNode prev) {
		this.prev = prev;
	}

	
		
}
