package com.arindam.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arindam.client.ProductClient;
import com.arindam.dto.ProductDto;
@Component
public class ProductFallBack implements ProductClient {

	@Override
	public List<ProductDto> getProducts() {
		System.out.println("CALLING PRODUCT FALLBACK");
		// TODO Auto-generated method stub
		ProductDto pdto=new ProductDto();
		pdto.setPid(0L);
		pdto.setPname("FALLBACK PRODUCT");
		pdto.setPqty(0);
		pdto.setPrice(0.0);
		return List.of(pdto);
	}

}
