package com.entity;

public class BookInfo {
	private int book_id;
	private String book_name;
	private String author;
	private String publisher;
	private String publish_time;
	private String ISBN;
	private String img_src;
	private String book_intro;
	private String author_intro;
	private float book_score;
	private int book_comments;
	private String label;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
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
	
	public float getBook_score() {
		return book_score;
	}
	public void setBook_score(float book_score) {
		this.book_score = book_score;
	}
	public int getBook_comments() {
		return book_comments;
	}
	public void setBook_comments(int book_comments) {
		this.book_comments = book_comments;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public BookInfo() {
		super();
	}
	public BookInfo(int book_id,String book_name,String author,String publisher,String ISBN,String publish_time,String img_src,String book_intro,String author_intro,float book_score,int book_comments,String label) {
        super();
        this.book_id=book_id;
        this.book_name=book_name;
        this.author=author;
        
        this.publisher=publisher;
        this.publish_time=publish_time;
        this.ISBN=ISBN;
        this.img_src=img_src;
        this.book_intro=book_intro;
        this.author_intro=author_intro;
        this.book_score=book_score;
        this.book_comments=book_comments;
        this.label=label;
        
    }
	
}
