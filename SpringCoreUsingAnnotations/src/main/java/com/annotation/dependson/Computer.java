package com.annotation.dependson;

public class Computer {

	String bookName;
	int marks;
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(String bookName, int marks) {
		super();
		this.bookName = bookName;
		this.marks = marks;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Computer [bookName=" + bookName + ", marks=" + marks + "]";
	}
	
	
}
