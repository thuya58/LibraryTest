package com.bestbright.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.dao.BookReturndao;
import com.bestbright.dto.BookReturndto;
import com.bestbright.models.BookRent;
import com.bestbright.models.BookReturn;
import com.bestbright.models.Customers;
@Service
@Transactional
public class BookReturnServiceImpl implements BookReturnService  {
	@Autowired
	BookReturndao bookReturndao;
	
	public void saveBookReturn(BookReturndto bookReturndto) {
		// TODO Auto-generated method stub
		BookReturn bookReturn = new BookReturn();
		bookReturn.setReturndate(bookReturndto.getReturndate());
		bookReturn.setFine_perday(bookReturndto.getFine_perday());
		bookReturn.setOverdue_date(bookReturndto.getOverdue_date());
		bookReturn.setFine_total(bookReturndto.getFine_total());
		bookReturn.getBookrent().setId(bookReturndto.getBookrent());
		
		bookReturndao.saveBookReturn(bookReturn);
	}

	public List<BookReturn> getBookReturnList() {
		// TODO Auto-generampted method stub
		return bookReturndao.getBookReturnList();
	}

	public void deleteBookReturn(long id) {
		// TODO Auto-generated method stub
		bookReturndao.deleteBookReturn(id);
	}

	public List<Customers> getCustomerList() {
		// TODO Auto-generated method stub
		return bookReturndao.getCustomerList();
	}

	public List<BookRent> getBookRentList() {
		// TODO Auto-generated method stub
		return bookReturndao.getBookRentList();
	}

}
