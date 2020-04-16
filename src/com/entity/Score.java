package com.entity;

public class Score {
	private int id;
	private String book_name;
	private String img_src;
	private float book_score;
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
	
	public float getBook_score() {
		return book_score;
	}
	public void setBook_score(float book_score) {
		this.book_score = book_score;
	}
	
	public Score() {
		super();
	}
	public Score(String img_src,String book_name,float book_score) {
        super();
        this.img_src=img_src;
        this.book_name = book_name;
        this.book_score=book_score;
    }
	
}
