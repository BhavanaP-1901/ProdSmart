package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Product;
@Repository
public class ProductDao {
	@Autowired
	private SessionFactory sf;

	public String addProduct(Product product) {
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.save(product);
			tx.commit();
			String msg="Product added successfully in database";
			
			return msg;
		}catch(Exception e){
			
			e.printStackTrace();
			String msg="Something went wrong";
			return msg;
		}
		
	}

	public List<Product> displayProduct() {
		List<Product> plist=null;
	
		
	try {	
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Product.class);
		plist=criteria.list();
		return plist;
	}catch(Exception e) {
		e.printStackTrace();
		String msg="Something went wrong";
		return plist;
	}

}
	

	public String deleteProduct(int pk) {
		System.out.println("We are in delete dao");
		Product product=null;
	
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			product=session.get(Product.class, pk);
			session.delete(product);
		    tx.commit();
		    String msg="Product deleted";
		    return msg;
		
	}catch(Exception e) {
		e.printStackTrace();
		String msg="Product not deleted";
	    return msg;
	}
		}

	public Product getProduct(int pk) {
		Product product=null;
		
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			product=session.get(Product.class, pk);
		    System.out.println(product);
		    return product;
		
	}catch(Exception e) {
		e.printStackTrace();
	    return product;
	}
		
	}

	public String updateProduct(Product product) {
		try {
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.saveOrUpdate(product);
			tx.commit();
			String msg="Product updated successfully in database";
			
			return msg;
		}catch(Exception e){
			
			e.printStackTrace();
			String msg="Something went wrong";
			return msg;
		}
		
	}
}