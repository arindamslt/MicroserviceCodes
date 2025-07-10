package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Product;
import com.arindam.service.ProductService;

@RestController
@RequestMapping("/product")
@RefreshScope
public class ProductController {
	@Autowired
private ProductService pservice;
@PostMapping("/add")
public ResponseEntity<String> addData(@RequestBody Product ps )
{
	String msg="PRODUCT ADDED SUCCESSFULLY";
	pservice.addData(ps);
	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
}
@GetMapping("/fetch")
public ResponseEntity<List<Product>> getData()
{
	List<Product> plist=pservice.getData();
	return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
}
@GetMapping("/fetch/{id}")
public ResponseEntity<Product> getProductId(@PathVariable Long id)
{
	Product ps=pservice.getProductId(id);
	return new ResponseEntity<Product>(ps,HttpStatus.OK);
}
@PutMapping("/del/{id}")
public ResponseEntity<String> deleteProduct(@PathVariable Long id)
{
	String msg="PRODUCT ITEM DELETED SUCCESSFULLY";
	Product ps=pservice.getProductId(id);
	if(ps!=null)
	{
		pservice.deleteProduct(id);
	}
	return new ResponseEntity<String>(msg,HttpStatus.OK);
}
}
