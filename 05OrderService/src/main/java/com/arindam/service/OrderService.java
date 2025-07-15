package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.arindam.model.Order;
import com.arindam.repository.OrderRepo;

@Service
public class OrderService {
@Autowired
private OrderRepo orepo;
@Autowired
private KafkaTemplate<String,String> kafkaTemplate;
private static final String TOPIC ="order-topic";
public void addData(Order o)
{
	orepo.save(o);
	kafkaTemplate.send(TOPIC,"Order Placed:"+o.getPname());
}
public List<Order> getData()
{
	return orepo.findAll();
}
}
