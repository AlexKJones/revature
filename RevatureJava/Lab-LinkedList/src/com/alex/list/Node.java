package com.alex.list;

public class Node {
	 Node next;
	 Integer data;
	 
	 public Integer getData() {
		 return data;
	 }
	 public void setData(Integer data) {
		 this.data = data;
	 }
	 public Node getNext() {
		 return next;
	 }
	 public void setNext(Node next) {
		 this.next = next;
	 }
	 public Node(Integer data ) {
		 super();
		 this.data = data;
		 
	 }
	 @Override
	 public String toString() {
		 return "Node [data=" + data + "]";
	 }
	 
}
