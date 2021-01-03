package com.psl.springtrg.springrest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer {

	

	@Id
	private long custId;
	
	@Column(name="name")
	private String custName;
	
	@Column(name="city")
	private String city;
	
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<PurchaseOrder> orders;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(long custid, String custname, String city) {
		super();
		this.custId = custid;
		this.custName = custname;
		this.city = city;
		
	}
	
	public List<PurchaseOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<PurchaseOrder> orders) {
		this.orders = orders;
	}

	public long getCustid() {
		return custId;
	}

	public void setCustid(long custid) {
		this.custId = custid;
	}

	public String getCustname() {
		return custName;
	}

	public void setCustname(String custname) {
		this.custName = custname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
}
