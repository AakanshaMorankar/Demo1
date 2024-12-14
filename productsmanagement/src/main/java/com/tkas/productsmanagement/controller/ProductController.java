package com.tkas.productsmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tkas.productsmanagement.entity.Products;



@Controller
public class ProductController {
	
	@GetMapping("/add-product")
      public String insertproduct() {
    	  return "add";
      }
	
	
		
		@PostMapping("/insert-product")
		public String addproduct(@ModelAttribute Products product) {
			System.out.println(" post method ");
			System.out.println(product);
			return "add";
		}
		 
}