package com.psl.springtrg.springrest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_details")
public class PurchaseOrder {
	
	@Id
	private long orderId;
	private int qty;
	
	@ManyToOne
    @JoinColumn(name = "custId")
	@JsonIgnore
	private Customer customer;
	
	/*@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name ="order_fk", referencedColumnName = "orderId")
	private List<Product> products;*/
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<Product> products;
	
	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PurchaseOrder(long orderId, int qty) {
		//super();
		this.orderId = orderId;
		this.qty = qty;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	

}
