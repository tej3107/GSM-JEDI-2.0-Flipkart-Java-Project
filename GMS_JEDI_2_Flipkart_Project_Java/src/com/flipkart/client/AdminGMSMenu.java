package com.flipkart.client;

import java.util.Scanner;

public class AdminGMSMenu {
	public static void Viewapprovals(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.GymOwner1 \n2.GymOwner2\n3.Approve all\n4.Exit");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			System.out.println("Gym1 Approved");
			break;
		case 2:
			System.out.println("Gym2 Approved");
			break;
		case 3:
			System.out.println("All Gym Approved");
			break;
		case 4:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}

	}

	public static void AdminActionPage(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.View Approval list \n2.Exit");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			Viewapprovals(in);
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
