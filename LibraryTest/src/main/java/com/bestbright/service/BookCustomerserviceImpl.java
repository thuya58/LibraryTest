package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.dao.BookCustomerdao;
import com.bestbright.models.Books;
import com.bestbright.models.Category;
import com.bestbright.models.Customers;
@Service
@Transactional
public class BookCustomerserviceImpl implements BookCustomerservice{
	@Autowired
	BookCustomerdao bookCustomerdao;
	public void saveCategory(Category cat) {
		// TODO Auto-generated method stub
		bookCustomerdao.saveCategory(cat);
		
	}

	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return bookCustomerdao.getCategoryList();
	}

	public void saveBook(Books books) {
		// TODO Auto-generated method stub
		bookCustomerdao.saveBook(books);
	}

	public List<Books> getBookList() {
		// TODO Auto-generated method stub
		return bookCustomerdao.getBookList();
	}

	public void saveCustomer(Customers customers) {
		// TODO Auto-generated method stub
		bookCustomerdao.saveCustomer(customers);
	}

	public List<Customers> getCustomerList() {
		// TODO Auto-generated method stub
		return bookCustomerdao.getCustomerList();
	}


	
}
