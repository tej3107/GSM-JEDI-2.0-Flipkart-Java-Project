package com.flipkart.client;

import java.util.Scanner;
import com.flipkart.service.*;
import java.util.Formatter; 

public class AdminGMSMenu {
	public static void ApproveOwner(Scanner in, AdminGMSInterface admin_service) {
		System.out.print("Enter Owner ID: ");
		String choice = in.next();
		if(admin_service.approveOwnerRequest(choice)) {
			System.out.print("Owner " + choice + " Request Approved");
		}else {
			System.out.print("Invalid Owner ID");
		}
	}
	
	public static void ApproveGym(Scanner in, AdminGMSInterface admin_service) {
		System.out.print("Enter Gym ID: ");
		String choice = in.next();
		if(admin_service.approveGymRequest(choice)) {
			System.out.print("Gym " + choice + " Request Approved");
		}else {
			System.out.print("Invalid Gym ID");
		}
	}

	public static void AdminActionPage(Scanner in) {
		System.out.println("Welcome to FlipFit Gymnasium Application");
		int choice = 0;
		AdminGMSInterface admin_service = new AdminGMSService();
		while(choice!=7) {
			System.out.println("Menu:-");
			System.out.println("1.Click 1 to See All Gym Owner \n"					
					+ "2.Click 2 to see all gyms \n"
					+ "3.Click 3 to see Pending Request \n"
					+ "4.Click 4 to Approve Owner Request \n"
					+ "5.Click 5 to Approve Gym Request \n"
					+ "6.Click 6 to Approve All Owner Request \n"
					+ "7.Click 7 to Approve All Gym Request \n"
					+ "8.Click 8 to Go to last Menu \n");
			System.out.print("Enter your choice: ");
			choice = in.nextInt();
			
			switch (choice) {
			// Case statements
			case 1:
				admin_service.seeAllGymOwner();
				break;
			case 2:
				admin_service.seeAllGyms();
				break;
			case 3:
				admin_service.seePendingRequest();
				break;
			case 4:
				ApproveOwner(in,admin_service);
				break;
			case 5:
				ApproveGym(in,admin_service);
				break;
			case 6:
				admin_service.approveAllOwnerRequest();
				break;	
			case 7:
				admin_service.approveAllGymRequest();
				break;
			case 8:
				System.out.println("Going to last Menu");
			// Default case statement
			default:
				System.out.println("incorrect choice");
			}
		}

	}
}