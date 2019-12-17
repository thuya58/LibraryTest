package com.bestbright.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String phone_no;
	
	@OneToMany(mappedBy = "customers" , targetEntity = BookRent.class , cascade = CascadeType.ALL)
	private List<BookRent> brlist;
	
	public Customers() {
		
	}

	public Customers(String name, String phone_no) {
		super();
		this.name = name;
		this.phone_no = phone_no;
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

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public List<BookRent> getBrlist() {
		return brlist;
	}

	public void setBrlist(List<BookRent> brlist) {
		this.brlist = brlist;
	}
	
	
	
}
