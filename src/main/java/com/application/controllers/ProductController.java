package com.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.application.dtos.ProductDto;
import com.application.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	


	@Autowired
	private ProductService productService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveProduct(@RequestBody ProductDto dto) throws Exception {

		productService.saveProduct(dto);

	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<ProductDto> getAllProduct() {
		

		return productService.getAllProduct();
	}

}
