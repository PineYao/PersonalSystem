package com.entity;

public class Comment {
	private int id;
	private String book_name;
	private String img_src;
	private int book_comments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public int getBook_comments() {
		return book_comments;
	}
	public void setBook_comments(int book_comments) {
		this.book_comments = book_comments;
	}
	public Comment() {
		super();
	}
	public Comment(String img_src,String book_name,int book_comments) {
        super();
        this.img_src=img_src;
        this.book_name = book_name;
        this.book_comments = book_comments;
    }
	
}
