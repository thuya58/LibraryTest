package com.bestbright.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "book_rent")
public class BookRent implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int rentqty;
	
	@Temporal(TemporalType.DATE)
	private Date rentdate ;
	private boolean bookreturn_status;
	
	@JoinColumn(name = "book_id")
	@ManyToOne
	private Books books=new Books();
	@JoinColumn(name = "customers_id")
	@ManyToOne
	private Customers customers=new Customers();
	@OneToMany(mappedBy = "bookrent",targetEntity = BookReturn.class,cascade = CascadeType.ALL)
	private List<BookReturn> breturnlist;
	
	public BookRent() {
		
	}
	
	
	public BookRent(int rentqty, Date rentdate, Books books, Customers customers) {
		super();
		this.rentqty = rentqty;
		this.rentdate = rentdate;
		this.books = books;
		this.customers = customers;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getRentqty() {
		return rentqty;
	}
	public void setRentqty(int rentqty) {
		this.rentqty = rentqty;
	}
	public Date getRentdate() {
		return rentdate;
	}
	public void setRentdate(Date rentdate) {
		this.rentdate = rentdate;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}


	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}


	public boolean isBookreturn_status() {
		return bookreturn_status;
	}


	public void setBookreturn_status(boolean bookreturn_status) {
		this.bookreturn_status = bookreturn_status;
	}
	

	
}
