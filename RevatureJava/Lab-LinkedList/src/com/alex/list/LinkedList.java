package com.alex.list;

import java.util.List;

public class LinkedList implements List<Integer>{
Node head;
    
    public void add(Integer data) {
    	Node node = new Node(data);
    	add(node);
    }
    
    public void add(Node node) {
    	if (head == null) {
    		head = node;
    	}else {
    		Node runner = head;
    		while(runner.getNext != null) {
    			runner = runner.getNext();
    		}
    		runner.setNext(node);
    	}
    }
    public void printList() {
    	Node runner = head;
    	while(runner != null) {
    		System.out.print(runner.toString()+"==>");
    		runner = runner.getNext();
    	}
    	System.out.print("null");
    }
    public Node remove() {
    	if(head != null) {
	    	Node last = head;
	    	head = head.getNext();
	    	return last;
    	}else {
    		return null;
    	}
    }

}
