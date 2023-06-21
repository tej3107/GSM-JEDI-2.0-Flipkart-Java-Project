package com.flipkart.client;

import java.util.Scanner;

public class GymnasiumGMSMenu {
	public static void GymOwnerRegistration(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Add Personal Details:-");
		System.out.print("Placeholder: ");
		String username = in.next();
		System.out.print("Placeholder: ");
		String password = in.next();
		System.out.flush();
	}
	

	public static void GymRegistration(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Add Personal Details:-");
		System.out.print("Placeholder: ");
		String username = in.next();
		System.out.print("Placeholder: ");
		String password = in.next();
		System.out.flush();
	}

	public static void GymOwnerActionPage(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.Add Gyms \n2.Exit");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			GymRegistration(in);
			break;
		case 2:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}

	}
}
