package com.alex.model;

public class Simulator {

	public static void main(String[] args){
	        CustomObject obj = new CustomObject("name");
	        System.out.println(obj.getName());

	        Object objRef = obj;
	        System.out.println(objRef);

	        Object objRef2 = (Object)obj;
	        System.out.println(objRef2);
    }
}
