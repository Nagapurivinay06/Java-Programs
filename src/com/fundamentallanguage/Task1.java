package com.fundamentallanguage;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i:");
		int i = sc.nextInt();
		System.out.println("enter j:");
		int j = sc.nextInt();
		add(i, j);
		sc.close();

	}

	static void add(int a, int b) {
		int sum = a + b;
		System.out.println("sum:" + sum);
	}
}
