package com.bestbright.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String type;
	private int due_date;
	@OneToMany(mappedBy = "category",targetEntity = Books.class,cascade = CascadeType.ALL)
	private List<Books> blist;
	
	public Category() {
		
	}

	public Category(String type, int due_date) {
		super();
		this.type = type;
		this.due_date = due_date;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDue_date() {
		return due_date;
	}
	public void setDue_date(int due_date) {
		this.due_date = due_date;
	}
	public List<Books> getBlist() {
		return blist;
	}
	public void setBlist(List<Books> blist) {
		this.blist = blist;
	}
	
	

}
