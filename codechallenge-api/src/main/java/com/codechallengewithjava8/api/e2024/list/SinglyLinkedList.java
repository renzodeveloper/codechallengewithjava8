package com.codechallengewithjava8.api.e2024.list;

import com.codechallengewithjava8.api.e2024.nodes.SinglyLinkedListNode;

public class SinglyLinkedList {

	protected SinglyLinkedListNode startNode, endNode;
	
	public SinglyLinkedList() {
		this.startNode = null;
		this.endNode = null;
	}
	
	public SinglyLinkedListNode getStartNode() {
		return startNode;
	}

	public SinglyLinkedListNode getEndNode() {
		return endNode;
	}

	public void insertAtTheBeginning(int value) {
		startNode=new SinglyLinkedListNode(value, startNode);
		if(endNode==null) {
			endNode=startNode;
			//System.out.println("starting the list with end: ["+fin.getData()+"]");
		}
	}
	
	public void insertAtTheEnd(int value) {
		if(!isEmpty()) {
			endNode.setNext(new SinglyLinkedListNode(value));
			endNode=endNode.getNext();
		}else {
			startNode=endNode=new SinglyLinkedListNode(value);
		}
	}
	
	public boolean isEmpty() {
		if(startNode==null) {
			return true;
		}
		return false;
	}
	
	public void printingList() {
		SinglyLinkedListNode pointer = startNode;
		while(pointer!=null) {
			System.out.print("["+pointer.getData()+"]---->");
			pointer=pointer.getNext();
		}
	}
	
	public void printingInfo() {
		System.out.print("startNode=["+getStartNode().getData()+"]");
		System.out.print(" && ");
		System.out.print("endNode=["+getEndNode().getData()+"]");
	}
}
