package com.Alex;

public class TestProductEquality {

    public static void main(String[] args) {
    	String a = "Good morning!";
    	System.out.println(a.charAt(9));
        Product p1 = new Product(1);
        Product p2 = new Product(1);
        Object o = new Object();

        if (p1.equals(p2)) {
            System.out.println("The products are equal!");
        }else {
            System.out.println("The products are NOT equal!");
        }

        if (p1.equals(o)) {
            System.out.println("The objects are equal!");
        }else {
            System.out.println("The objects are NOT equal!");
        }
    }
}
