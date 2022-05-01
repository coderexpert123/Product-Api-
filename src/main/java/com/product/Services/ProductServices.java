package com.product.Services;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.FlashMap;

import com.product.entities.Product;

@Component
public class ProductServices {
	
	
	private static List<Product> list=new ArrayList<>();
	
	static{

		list.add(new Product(0, "Java", "Spring Fraework", "Nice", "678"));
		
		list.add(new Product(1, "Django", "Spring Fraework", "Nice", "678"));

		list.add(new Product(2, "React Js", "Spring Fraework", "Nice", "678"));

	}

	//get all the book 
	
	public List<Product> getAllname() {
	
		return list;
		
	}
	
	//get single book by ID
	
	public Product getById(int id) {
		
		Product product=null;
		product=list.stream().filter(e->e.getId()==id)
				.findFirst().get();
		return product;
	
	}
	
	//function for deleting the products
	
	public void deleteproduct(int pr) {
		
		list=list.stream().filter(Product->Product.getId()!=pr)
				.collect(Collectors.toList());
		
	}
	
	//function for updating the product
	
	public Product updatesProduct(Product product) {
		
		list.add(product);
		return product;
		
		
	}
	
}
