package com.bestbright.models;

import java.io.Serializable;
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

@Entity
@Table(name = "books")
public class Books implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int qty;
	@OneToMany(mappedBy = "books",targetEntity = BookRent.class,cascade = CascadeType.ALL)
	private List <BookRent> brentlist;
	
	@JoinColumn(name = "category_id")
	@ManyToOne
	private Category category;
	
	public Books() {
		
	}
	
	public Books(String name, int qty, Category category) {
		super();
		this.name = name;
		this.qty = qty;
		this.category = category;
	}

	public Books(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}


	public List<BookRent> getBrentlist() {
		return brentlist;
	}

	public void setBrentlist(List<BookRent> brentlist) {
		this.brentlist = brentlist;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}
