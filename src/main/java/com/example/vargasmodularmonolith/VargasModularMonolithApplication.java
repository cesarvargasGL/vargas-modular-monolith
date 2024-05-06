package com.example.vargasmodularmonolith;

import com.example.vargasmodularmonolith.product.internal.Product;
import com.example.vargasmodularmonolith.product.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class VargasModularMonolithApplication {

	public static void main(String[] args) {
		SpringApplication.run(VargasModularMonolithApplication.class, args)
				.getBean(ProductService.class)
				.create(new Product("vargas-modular-monolith-application", "this is your modular app", 10));
	}
}
