package com.bestbright.models;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_return")
public class BookReturn implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private LocalDate returndate;
	private double fine_perday;
	private int overdue_date;
	private double fine_total;
	@JoinColumn(name = "bookrent_id")
	@ManyToOne
	private BookRent bookrent;
	
	//private Customers customers;
	
	
	public BookReturn() {
		
	}

	

	public BookReturn(LocalDate returndate, double fine_perday, int overdue_date, double fine_total,
			BookRent bookrent) {
		super();
		this.returndate = returndate;
		this.fine_perday = fine_perday;
		this.overdue_date = overdue_date;
		this.fine_total = fine_total;
		this.bookrent = bookrent;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public LocalDate getReturndate() {
		return returndate;
	}

	public void setReturndate(LocalDate returndate) {
		this.returndate = returndate;
	}

	public double getFine_perday() {
		return fine_perday;
	}

	public void setFine_perday(double fine_perday) {
		this.fine_perday = fine_perday;
	}

	public int getOverdue_date() {
		return overdue_date;
	}

	public void setOverdue_date(int overdue_date) {
		this.overdue_date = overdue_date;
	}

	public double getFine_total() {
		return fine_total;
	}

	public void setFine_total(double fine_total) {
		this.fine_total = fine_total;
	}

	public BookRent getBookrent() {
		return bookrent;
	}

	public void setBookrent(BookRent bookrent) {
		this.bookrent = bookrent;
	}



	/*public Customers getCustomers() {
		return customers;
	}



	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	*/
	
	
	
}
