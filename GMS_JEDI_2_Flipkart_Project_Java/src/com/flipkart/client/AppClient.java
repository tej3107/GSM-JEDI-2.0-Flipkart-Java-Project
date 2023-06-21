/**
 * 
 */
package com.flipkart.client;

import java.util.*;

import com.flipkart.bean.*;
import com.flipkart.service.*;

/**
 * 
 */
public class AppClient {

	/**
	 * @param args
	 */

	public static void LoginMenu(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("Login Credentials:-");
		System.out.print("Username: ");
		String username = in.next();
		System.out.print("Password: ");
		String password = in.next();
		System.out.print("Select Role:-\n1.Admin\n2.Customer\n3.Gym Onwer ");
		int role = in.nextInt();
		User user = new User(username,password,role);
		UserService authentication = new UserService();
		if(authentication.authenticateUser(user)) {
			System.out.println("Logged In");
			switch(role) {
			case 1: AdminActionPage(in);
			break;
			case 2: CustomerActionPage(in);
			break;
			case 3: GymOwnerActionPage(in);
			break;
			}
		}else {
			System.out.println("Invalid Creentials");
		}
		
	}

	public static void CustomerRegistration(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Add Personal Details:-");
		System.out.print("Placeholder: ");
		String username = in.next();
		System.out.print("Placeholder: ");
		String password = in.next();
		CustomerActionPage(in);
	}

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

	public static void BookGym(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.Slot1 \n2.Slot2\n3.Go Back\n4.Exit");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			System.out.println("Slot Booked");
			break;
		case 2:
			System.out.println("Slot Full Please select another slot");
			break;
		case 3:
			ViewCatalog(in);
			break;
		case 4:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}

	}

	public static void ViewCatalog(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.Gym1 \n2.Gym2\n3.Exit");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			BookGym(in);
			break;
		case 2:
			BookGym(in);
			break;
		case 3:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}

	}
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
	
	public static void CustomerActionPage(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.View Gyms \n2.View Slots\n3.Exit");
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			ViewCatalog(in);
			break;
		case 2:
			System.out.println("Viewing Booked Slots");
			break;
		case 3:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}

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

	public static void main(String args[]) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		System.out.println("Menu:-");
		System.out.println("1.Login \n2.Customer Registration\n3.GymOwner Registration\n4.Update Password\n5.Exit");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int choice = in.nextInt();
		switch (choice) {
		// Case statements
		case 1:
			LoginMenu(in);
			break;
		case 2:
			CustomerRegistration(in);
			break;
		case 3:
			GymOwnerRegistration(in);
			break;
		case 4:
			CustomerRegistration(in);
			break;
		case 5:
			System.exit(0);
			break;
		// Default case statement
		default:
			System.out.println("incorrect choice");
		}
		in.close();
	}

}
