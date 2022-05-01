package com.product.entities;

public class Product {
	
	private int id;
	private String productName;
	private String productDescription;
	private String productSize;
	private String pproductprice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String productName, String productDescription, String productSize, String pproductprice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productSize = productSize;
		this.pproductprice = pproductprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public String getPproductprice() {
		return pproductprice;
	}
	public void setPproductprice(String pproductprice) {
		this.pproductprice = pproductprice;
	}
	
	
}
