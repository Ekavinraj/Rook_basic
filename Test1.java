package IfElse;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {

		Scanner d = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = d.nextInt();
		if (age >= 18) {
			System.out.println("Age is greater than 18,you are major");
		} else if (age < 18) {
			System.out.println("Age is lesser than 18 ,you are minor");

		} else {
			System.out.println("Invalid age");
		}
		d.close();

	}
}
