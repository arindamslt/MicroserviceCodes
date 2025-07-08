package com.arindam.dto;

public class ProductDto {
private Long pid;
private String pname;
private Integer pqty;
private Double price;
public Long getPid() {
	return pid;
}
public void setPid(Long pid) {
	this.pid = pid;
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
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
