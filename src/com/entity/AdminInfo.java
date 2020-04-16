package com.entity;

public class AdminInfo {
	private int admin_id;
	private String admin_name;
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	private String admin_account;
	private String admin_password;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_account() {
		return admin_account;
	}
	public void setAdmin_account(String admin_account) {
		this.admin_account = admin_account;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public AdminInfo() {
		super();
	}
	public AdminInfo(int admin_id,String admin_name,String admin_account,String admin_password) {
        super();
        
        this.admin_id=admin_id;
        this.admin_name = admin_name;
        this.admin_account=admin_account;
        this.admin_password=admin_password;
    }
	
}
