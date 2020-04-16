package com.entity;

public class CommentInfo {
	private int id;
	private String user;
	private String comment;
	private String ISBN;
	private String date;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public CommentInfo() {
		super();
	}
	public CommentInfo(int id,String user,String comment,String ISBN,String date) {
        super();
        
        this.id=id;
        this.user = user;
        this.ISBN=ISBN;
        this.comment=comment;
        this.date=date;
    }
	
}
