package com.livekampus.friendservices.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Friend {
	
	private String userDp;
	private String userName;
	
	public Friend() {
		super();
		
	}
	
	public Friend(String userDp, String userName) {
		super();
		this.userDp = userDp;
		this.userName = userName;
	}
	
	
//	public Friend(String userName) {
//		super();
//		this.userName = userName;
//	}

	public String getUserDp() {
		return userDp;
	}
	public void setUserDp(String userDp) {
		this.userDp = userDp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
