/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class Administrator {
	private String adminId;
	private String name;
	private String mobile;
	
	private Gymnasium gymsAvailable[];
	private GymOwner ownerEnrolled[];
	
	
	public String getAdminId() {
		return adminId;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
