package com.grocerysystem;

import com.grocerysystem.model.Product;
import com.grocerysystem.model.Member;

public class Main {

	public static void main(String[] args) {

        Product p = new Product(1, "Milk", 3.99);


        Member m = new Member(1, "Avery", "avery@email.com");

        System.out.println(p);
        System.out.println(m);
		
	}

}
