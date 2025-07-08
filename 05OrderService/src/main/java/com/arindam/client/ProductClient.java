package com.arindam.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.arindam.dto.ProductDto;
import com.arindam.fallback.ProductFallBack;
@FeignClient(name="product-service",fallback = ProductFallBack.class)
public interface ProductClient {
	@GetMapping("/product/fetch")
	public List<ProductDto> getProducts();
}
