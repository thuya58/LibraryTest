package com.bestbright.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bestbright.models.BookRent;
import com.bestbright.models.BookReturn;
import com.bestbright.models.Customers;

@Repository
public class BookReturndaoImpl implements BookReturndao {
	@Autowired
	SessionFactory sessionFactory;
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void saveBookReturn(BookReturn bookReturn) {
		// TODO Auto-generated method stub
		getCurrentSession().save(bookReturn);
	}

	public List<BookReturn> getBookReturnList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(BookReturn.class).list();
	}

	public void deleteBookReturn(long id) {
		// TODO Auto-generated method stub
		BookReturn bookReturn = getCurrentSession().get(BookReturn.class,id);
		getCurrentSession().delete(bookReturn);
	}

	public List<Customers> getCustomerList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Customers.class).list();
	}

	public List<BookRent> getBookRentList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(BookRent.class).list();
	}

}
