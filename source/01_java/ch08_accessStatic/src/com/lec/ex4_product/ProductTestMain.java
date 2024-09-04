package com.lec.ex4_product;

public class ProductTestMain {
	public static void main(String[] args) {
		System.out.println(Product.count);	// static int count = 100;에 카운트를 더함
		Product p1 = new Product("S23");	// 객체1(변수)
		p1.infoPrint();
		System.out.println(Product.count);	
		Product p2 = new Product("S23");	// 객체1(변수)
		Product p3 = new Product("S23");	// 객체1(변수)
		p2.infoPrint();
		p3.infoPrint();
	}
}
