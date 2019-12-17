package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.dao.BookRentdao;
import com.bestbright.dto.BookRentdto;
import com.bestbright.models.BookRent;
import com.bestbright.models.Books;
import com.bestbright.models.Customers;
@Service
@Transactional
public class BookRentServiceImpl implements BookRentService{
	@Autowired
	BookRentdao bookRentdao;

	public void saveBookRent(BookRentdto bookRent) {
		// TODO Auto-generated method stub
		
		System.out.println(bookRent.getBook_id() +"  "+bookRent.getCustomer_id()+" "+bookRent.getRentQty());
		BookRent bRent=new BookRent();
		/*
		 * if(bookRent.getId()!=0){ bRent.setId(bookRent.getId()); }
		 */
		bRent.setRentqty(bookRent.getRentQty());
		bRent.setRentdate(bookRent.getRentDate());
		bRent.getBooks().setId(bookRent.getBook_id());
		bRent.getCustomers().setId(bookRent.getCustomer_id());
		
		//bRent.setRentdate(bookRent.getCustomer_id());			
		bookRentdao.saveBookRent(bRent);
	}
	

	public List<BookRent> getBookRentList() {
		// TODO Auto-generated method stub
		return bookRentdao.getBookRentList();
	}

	public List<Books> getBookList() {
		// TODO Auto-generated method stub
		return bookRentdao.getBookList();
	}

	public List<Customers> getCustomerList() {
		// TODO Auto-generated method stub
		return bookRentdao.getCustomerList();
	}


	public void deleteBookRent(long id) {
		// TODO Auto-generated method stub
		bookRentdao.deleteBookRent(id);
	}


	public List<BookRentdto> getBookRentListByCustomerId(long id) {
		// TODO Auto-generated method stub
		return bookRentdao.getBookRentListByCustomerId(id);
	}



}
