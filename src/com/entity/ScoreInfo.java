package com.entity;

public class ScoreInfo {
	private int id;
	private String user;
	private String score;
	private String ISBN;
	private String book_name;
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
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public ScoreInfo() {
		super();
	}
	public ScoreInfo(int id,String user,String score,String ISBN,String book_name) {
        super();
        
        this.id=id;
        this.user = user;
        this.ISBN=ISBN;
        this.score=score;
        this.book_name=book_name;
    }
}
