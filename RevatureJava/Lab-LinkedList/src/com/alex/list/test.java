package com.alex.list;


import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		LinkedList example = new LinkedList();
		example.add(2);
		example.add(4);
		example.add(5);
		example.printList();
//		Integer sample = example.get(2);
		//example.printList();
//		System.out.println(sample);
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("A");
		myList.add("R");
		myList.add("Q");
		
		int[] array = { 1,2,3,4,5,6,7};
		System.out.println(array[6]);
		
	}

}
