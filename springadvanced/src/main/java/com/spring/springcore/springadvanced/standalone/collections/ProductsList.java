package com.spring.springcore.springadvanced.standalone.collections;

import java.util.List;

public class ProductsList {
	List<String> productList;

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ProductsList [productList=" + productList + "]";
	}
	
}
