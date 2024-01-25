package com.myshop.dto;

public class ProductDTO {

	private int ProdNo;
	private String ProdName;
	private int stock;
	private int price;
	private String company;
	
	public int getProdNo() {
		return ProdNo;
	}
	public void setProdNo(int prodNo) {
		ProdNo = prodNo;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "[ProdNo=" + ProdNo + ", ProdName=" + ProdName + ", stock=" + stock + ", price=" + price
				+ ", company=" + company + "]";
	}
}
