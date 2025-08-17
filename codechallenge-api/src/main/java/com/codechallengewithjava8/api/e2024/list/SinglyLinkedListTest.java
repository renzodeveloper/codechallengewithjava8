package com.codechallengewithjava8.api.e2024.list;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtTheBeginning(4);
		list.insertAtTheEnd(5);
		list.insertAtTheBeginning(3);
		list.insertAtTheBeginning(2);
		list.insertAtTheBeginning(99);
		
		list.printingList();
		System.out.println();
		System.out.println();
		list.printingInfo();
//		Integer a = 8;
//		Integer b = 8;
//		if (a.compareTo(b) > 0) {
//			System.out.println("a es mayor que b");
//		} else if (a.compareTo(b) < 0) {
//			System.out.println("a es menor que b");
//		} else if (a.compareTo(b) == 0) {
//			System.out.println("a es igual que b");
//		}
	}
	
}
