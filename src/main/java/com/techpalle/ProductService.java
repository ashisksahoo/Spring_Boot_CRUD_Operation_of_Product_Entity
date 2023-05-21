package com.techpalle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	@Autowired
	private IProductService productService;
	
	public ProductService(IProductService productService) 
	{
		super();
		this.productService = productService;
	}

	public List<Product> getAllProducts()
	{
		return productService.findAll();
	}
	
	public Product getProductById(int id)
	{
		return productService.findById(id).orElse(null);
	}
	
	public Product saveProduct(Product product)
	{
		return productService.save(product);
	}
	
	public void deleteProduct(int id)
	{
		productService.deleteById(id);
	}
}
