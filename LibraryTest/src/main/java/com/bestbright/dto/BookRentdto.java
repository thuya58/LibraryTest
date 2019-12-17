package com.bestbright.dto;

import java.util.Date;

public class BookRentdto {

	private long id;
	private int rentQty;
	private Date rentDate;
	private long book_id;
	private long customer_id;
	private String bookrentName;
	
	public BookRentdto() {
		
	}

	public BookRentdto(int rentQty,Date rentDate, long book_id, long customer_id) {
		super();
		this.rentQty = rentQty;
		this.rentDate = rentDate;
		this.book_id = book_id;
		this.customer_id = customer_id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRentQty() {
		return rentQty;
	}

	public void setRentQty(int rentQty) {
		this.rentQty = rentQty;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getBookrentName() {
		return bookrentName;
	}

	public void setBookrentName(String bookrentName) {
		this.bookrentName = bookrentName;
	}

	
	
	


}
