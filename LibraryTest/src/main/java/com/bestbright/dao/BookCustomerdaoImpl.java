package com.bestbright.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bestbright.models.Books;
import com.bestbright.models.Category;
import com.bestbright.models.Customers;
@Repository
public class BookCustomerdaoImpl implements BookCustomerdao{
	@Autowired
	SessionFactory sessionFactory;
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void saveCategory(Category cat) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(cat);
		
	}

	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		return	getCurrentSession().createCriteria(Category.class).list();
	}

	public void saveBook(Books books) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(books);
	}

	public List<Books> getBookList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Books.class).list();
	}

	public void saveCustomer(Customers customers) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(customers);
		
	}

	public List<Customers> getCustomerList() {
		// TODO Auto-generated method stub
		return getCurrentSession().createCriteria(Customers.class).list();
	}

}
