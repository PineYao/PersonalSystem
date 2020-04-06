package com.entity;

public class Books {
	private int id;
	private String book_name;
	private String author;
	private String publisher;
	private String publish_time;
	private String ISBN;
	private String img_src;
	private String book_intro;
	private String author_intro;
	private String book_score;
	private String book_comments;
	private String label;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public String getBook_intro() {
		return book_intro;
	}
	public void setBook_intro(String book_intro) {
		this.book_intro = book_intro;
	}
	public String getAuthor_intro() {
		return author_intro;
	}
	public void setAuthor_intro(String author_intro) {
		this.author_intro = author_intro;
	}
	public String getBook_score() {
		return book_score;
	}
	public void setBook_score(String book_score) {
		this.book_score = book_score;
	}
	public String getBook_comments() {
		return book_comments;
	}
	public void setBook_comments(String book_comments) {
		this.book_comments = book_comments;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Books() {
		super();
	}
	public Books(String img_src,String book_name,String author,String publisher) {
        super();
        this.img_src=img_src;
        this.book_name = book_name;
        this.author=author;
        this.publisher = publisher;
    }
	
}
