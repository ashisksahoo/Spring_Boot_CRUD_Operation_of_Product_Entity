package com.techpalle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	private ProductService productService;

	public ProductController(ProductService productService) 
	{
		super();
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id)
	{
		return productService.getProductById(id);
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product)
	{
		return productService.saveProduct(product);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product product)
	{
		Product exProduct = productService.getProductById(id);
		if (exProduct == null)
		{
			return null;
		}
		exProduct.setBatchno(product.getBatchno());
		exProduct.setNoofproduct(product.getNoofproduct());
		exProduct.setPname(product.getPname());
		exProduct.setPrice(product.getPrice());
		return productService.saveProduct(exProduct);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productService.deleteProduct(id);
	}
}
