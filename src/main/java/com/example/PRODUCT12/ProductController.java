package com.example.PRODUCT12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/product")
public class ProductController {
	
	@GetMapping(path="/save")
	public boolean getProduct() {
		return true;
	}

}
