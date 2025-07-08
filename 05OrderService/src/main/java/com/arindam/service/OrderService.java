package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Order;
import com.arindam.repository.OrderRepo;

@Service
public class OrderService {
@Autowired
private OrderRepo orepo;
public void addData(Order o)
{
	orepo.save(o);
}
public List<Order> getData()
{
	return orepo.findAll();
}
}
