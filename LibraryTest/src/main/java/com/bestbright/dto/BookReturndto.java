package com.bestbright.dto;

import java.util.Date;

public class BookReturndto {
	
	private long id;
	private Date returndate;
	private double fine_perday=200D;
	private int overdue_date;
	private double fine_total;
	private long bookrent;
	private long customerdto;
	
	
	public BookReturndto() {
		
	}

	


	public BookReturndto(long id, Date returndate, double fine_perday, int overdue_date, double fine_total,
			long bookrent) {
		super();
		this.id = id;
		this.returndate = returndate;
		this.fine_perday = fine_perday;
		this.overdue_date = overdue_date;
		this.fine_total = fine_total;
		this.bookrent = bookrent;
	}

	public BookReturndto(Date returndate, double fine_perday, int overdue_date, double fine_total, long bookrent) {
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

	public Date getReturndate() {
		return returndate;
	}

	public void setReturndate(Date returndate) {
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

	public long getBookrent() {
		return bookrent;
	}

	public void setBookrent(long bookrent) {
		this.bookrent = bookrent;
	}

	public long getCustomerdto() {
		return customerdto;
	}

	public void setCustomerdto(long customerdto) {
		this.customerdto = customerdto;
	}


	
	
	
}
