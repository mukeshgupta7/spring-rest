package com.psl.springtrg.springrest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product_details")
public class Product {
	
	@Id
	private long prodId;
	private String prodName;
	private double price;
	
	@ManyToOne
    @JoinColumn(name = "orderid")
	@JsonIgnore
	private PurchaseOrder order;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(long prodId, String prodName, double price) {
		//super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
	
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
