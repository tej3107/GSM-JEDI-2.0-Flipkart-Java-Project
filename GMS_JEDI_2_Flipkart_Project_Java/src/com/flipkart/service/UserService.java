/**
 * 
 */
package com.flipkart.service;
import com.flipkart.bean.*;

import java.util.HashMap;
import java.util.List;

/**
 * 
 */
public class UserService implements UserServiceInterface {
	
	HashMap<String,User> Users = new HashMap<>();
	public UserService() {
		User admin1 = new User("Admin1","P1",1);
		User admin2 = new User("Admin2","P2",1);
		User admin3 = new User("Admin3","P3",1);
		Users.put(admin1.getUserName(), admin1);
		Users.put(admin2.getUserName(), admin2);
		Users.put(admin3.getUserName(), admin3);
		
	}
	
	public boolean registerCustomer(Registration customerData) {
		return true;
	}
	
	public boolean registerGymOwner(Registration ownerData) {
		return true;
	}
	
	public boolean authenticateUser(User userData) {
		String UserPass = userData.getPassword();
		String UserName = userData.getUserName();
		User Data = Users.get(UserName);
		
		if(Data==null) {return false;}
		else {
			return true;
		}		
	}
	
	public boolean logout(User userData) {
		return true;
	}
}
