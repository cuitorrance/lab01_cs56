//Author: Torrance Cui
//Book class

import java.text.DecimalFormat;

public class Book {
	
    private int numPages;
    private int datePub;
    private double price;
    private String title;
    private Author author;
	
    /*default**/
    public Book() {
	setNumPages(0);
	setDatePub(0);
	setPrice(0.0);
	setTitle("");
	author = new Author();
    }
    public Book(int numPages, int datePub, double price, String title, Author author) {
	setNumPages(numPages);
	setDatePub(datePub);
	setPrice(price);
	setTitle(title);
	this.author = author;
    }
	
    public void setNumPages(int numPages) {
	this.numPages = numPages;
    }
    public int getNumPages() {
	return numPages;
    }
	
    public void setDatePub(int datePub) {
	this.datePub = datePub;
    }
    public int getDatePub() {
	return datePub;
    }
	
    public void setPrice(double price) {
	this.price = price;
    }
    public double getPrice() {
	return price;
    }
	
    public void setTitle(String title) {
	this.title = title;
    }
    public String getTitle() {
	return title;
    }

    public void setAuthor(String firstName, String lastName, int birthYear, int numOfPublications)
    { 
	this.author.setFirst(firstName);
	this.author.setLast(lastName);
	this.author.setBirth(birthYear);
	this.author.setNumPub(numOfPublications);
    }
    public Author getAuthor() {
	return author;
    }
	
    public String toString() {
	DecimalFormat numberFormat = new DecimalFormat("#.00");
	return "Title: " + getTitle() + "\n" +
	    "Published in: " + getDatePub() + "\n" +
	    "Number of Pages: " + getNumPages() + "\n" + 
	    "Price: $" + numberFormat.format(getPrice()) + "\n" +
	    author.toString();
    }

}
