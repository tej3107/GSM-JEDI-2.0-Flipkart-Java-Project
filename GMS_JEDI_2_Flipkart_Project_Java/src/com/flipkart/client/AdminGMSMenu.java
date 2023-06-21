package com.flipkart.client;

import java.util.Scanner;
import java.util.Formatter; 

public class AdminGMSMenu {
	public static void Viewapprovals(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		Formatter fmt = new Formatter();  
		fmt.format("%15s %15s %15s\n", "Gym ID", "Gym Name", "Apporval Status");  
		fmt.format("%15s %15s %15s\n", "1", "A", "No");  
		fmt.format("%15s %15s %15s\n", "2", "B", "Yes");  
		System.out.println(fmt);  

		System.out.print("Enter Gym ID: ");
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
