/**
 * 
 */
package com.flipkart.service;

/**
 * 
 */
public interface AdminGMSInterface {
	public void seeAllGymOwner();
	
	public void seeAllGyms();
	
	public void seePendingRequest();
	
	public boolean approveOwnerRequest(String requestId);
	
	public boolean approveAllOwnerRequest();
	
	public boolean approveGymRequest(String gymId);
	
	public boolean approveAllGymRequest();
}
