package com.arindam.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="order_dtls")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(length = 25,nullable = false)
private String pname;
private Integer pqty;
@CreationTimestamp
@Temporal(TemporalType.DATE)
private Date orderdt;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Order(Long id, String pname, Integer pqty, Date orderdt) {
	super();
	this.id = id;
	this.pname = pname;
	this.pqty = pqty;
	this.orderdt = orderdt;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Integer getPqty() {
	return pqty;
}
public void setPqty(Integer pqty) {
	this.pqty = pqty;
}
public Date getOrderdt() {
	return orderdt;
}
public void setOrderdt(Date orderdt) {
	this.orderdt = orderdt;
}
@Override
public String toString() {
	return "Order [id=" + id + ", pname=" + pname + ", pqty=" + pqty + ", orderdt=" + orderdt + "]";
}

}
