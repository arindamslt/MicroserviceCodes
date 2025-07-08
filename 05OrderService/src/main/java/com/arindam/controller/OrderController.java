package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.client.ProductClient;
import com.arindam.dto.ProductDto;
import com.arindam.model.Order;
import com.arindam.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
@Autowired
private OrderService oservice;
@Autowired
private ProductClient pclient;
@PostMapping("/add")
public ResponseEntity<String> addData(@RequestBody Order o)
{
	String msg="ORDER HAS BEEN DONE SUCCESSFULLY";
	 oservice.addData(o);
	 return new ResponseEntity<String>(msg,HttpStatus.CREATED);
}
@GetMapping("/fetch")
public ResponseEntity<List<Order>> getData()
{
	List<Order> olist=oservice.getData();
	return new ResponseEntity<List<Order>>(olist,HttpStatus.OK);
}
@GetMapping("/products")
public ResponseEntity<List<ProductDto>> getProducts()
{
	List<ProductDto> plist=pclient.getProducts();
	return new ResponseEntity<List<ProductDto>>(plist,HttpStatus.OK);
}
}
