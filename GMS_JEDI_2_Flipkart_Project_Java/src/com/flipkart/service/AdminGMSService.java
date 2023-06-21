/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.*;
import java.util.*;

/**
 * 
 */
public class AdminGMSService implements AdminGMSInterface{
	private List<GymOwner> gymOwner = new ArrayList<GymOwner>();
	private List<Gymnasium> gymsAvailable = new ArrayList<Gymnasium>();
	
	public AdminGMSService() {
		GymOwner owner1 = new GymOwner();
		owner1.setOwnerId("O001");
		owner1.setName("Dummy1");
		owner1.setApproved(true);
		
		GymOwner owner2 = new GymOwner();
		owner2.setOwnerId("O002");
		owner2.setName("Dummy2");
		owner2.setApproved(false);
		
		GymOwner owner3 = new GymOwner();
		owner3.setOwnerId("O003");
		owner3.setName("Dummy3");
		owner3.setApproved(true);
		
		GymOwner owner4 = new GymOwner();
		owner4.setOwnerId("O004");
		owner4.setName("Dummy4");
		owner4.setApproved(false);
		
		GymOwner owner5 = new GymOwner();
		owner5.setOwnerId("O005");
		owner5.setName("Dummy5");
		owner5.setApproved(false);
		
		Gymnasium gym1 = new Gymnasium();
		gym1.setGymId("G001");
		gym1.setName("Gym1");
		gym1.setOwnerId("O001");
		gym1.setApproved(true);
		
		Gymnasium gym2 = new Gymnasium();
		gym2.setGymId("G002");
		gym2.setName("Gym2");
		gym2.setOwnerId("O001");
		gym2.setApproved(false);
		
		Gymnasium gym3 = new Gymnasium();
		gym3.setGymId("G003");
		gym3.setName("Gym3");
		gym3.setOwnerId("O001");
		gym3.setApproved(false);
		
		gymOwner.add(owner1);
		gymOwner.add(owner2);
		gymOwner.add(owner3);
		gymOwner.add(owner4);
		gymOwner.add(owner5);
		
		gymsAvailable.add(gym1);
		gymsAvailable.add(gym2);
		gymsAvailable.add(gym3);
		
//		seeAllGyms();
	}
	
	public void seeAllGymOwner() {
		for(GymOwner value: gymOwner) {
			System.out.println(value.getOwnerId() + " " + value.getName() + " " + value.isApproved());
		}
	}
	
	public void seeAllGyms() {
		for(Gymnasium value: gymsAvailable) {
			System.out.println(value.getGymId() + " " + value.getName() + " " + value.getOwnerId() + " " + value.isApproved());
		}
	}
	
	public void seePendingRequest() {
		for(GymOwner value: gymOwner) {
			if(!value.isApproved()) {
				System.out.println(value.getOwnerId() + " " + value.getName() + " " + value.isApproved());
			}
		}
	}
	
	public boolean approveOwnerRequest(String requestId) {
		int index = 0;
		for(GymOwner value: gymOwner) {
			if(value.getOwnerId().equals(requestId)) break;
			else index++;
		}
		
		if(index == gymOwner.size() || gymOwner.get(index).isApproved()) return false;
		else gymOwner.get(index).setApproved(true);
		
		return true;
	}
	
	public boolean approveAllOwnerRequest() {
		int count = 0;
		for(GymOwner value: gymOwner) {
			if(!value.isApproved()) {
				value.setApproved(true);
				count++;
			}
		}
		
		return (count != 0);
	}
	
	public boolean approveGymRequest(String gymId) {
		int index = 0;
		for(Gymnasium value: gymsAvailable) {
			if(value.getGymId().equals(gymId)) break;
			else index++;
		}
		
		if(index == gymsAvailable.size() || gymsAvailable.get(index).isApproved()) return false;
		else gymsAvailable.get(index).setApproved(true);
		
		return true;
	}
	
	
	public boolean approveAllGymRequest() {
		int count = 0;
		for(Gymnasium value: gymsAvailable) {
			if(!value.isApproved()) {
				value.setApproved(true);
				count++;
			}
		}
		
		return (count != 0);
	}
} 
