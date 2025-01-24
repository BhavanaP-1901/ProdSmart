package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.ProductDao;
import com.tka.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao pd;

	public String addProduct(Product product) {
		
		String msg=pd.addProduct(product);
		return msg;
	}

	public List<Product> displayProduct() {
		List<Product> plist=pd.displayProduct();
		return plist;
	}

	public String deleteProduct(int pk) {
	String msg=pd.deleteProduct(pk);	
		return msg;
	}

	public Product getProduct(int pk) {
	Product product=pd.getProduct(pk);
		return product;
	}

	public String updateProduct(Product product) {
		String msg=pd.updateProduct(product);
		return msg;
	}

}
