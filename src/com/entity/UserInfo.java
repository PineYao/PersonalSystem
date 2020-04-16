package com.entity;

public class UserInfo {
	private int user_id;
	private String user_name;
	private String user_account;
	private String user_password;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getInterested() {
		return interested;
	}
	public void setInterested(String interested) {
		this.interested = interested;
	}
	private String interested;
	
	public UserInfo() {
		super();
	}
	public UserInfo(int user_id,String user_name,String user_account,String user_password,String interested) {
        super();
        this.user_id=user_id;
        this.user_name=user_name;
        this.user_account=user_account;
        this.user_password=user_password;
        this.interested=interested;
    }
	
}
