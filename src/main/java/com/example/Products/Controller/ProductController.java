package com.example.Products.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Products.Model.Product;
import com.example.Products.Service.PService;

@RestController
public class ProductController 
{   @Autowired
	PService sev;
@PostMapping("/addProduct")
public Product addProduct(@RequestBody Product product)
{
	return sev.saveProduct(product);
}
@PostMapping("/addproducts")
public List<Product> addProducts(@RequestBody List<Product> products)
{
	return sev.saveProducts(products);
}
@GetMapping("/findProductById/{id}")
public Product findProductById(@PathVariable int id)
{
	return sev.getProductById(id);
}
@GetMapping("/ProductByName/{name}")
public Product findByName(String name)
{
	return sev.getProductByName(name);
}
@GetMapping("/Products")
public List<Product> getProducts()
{
	return sev.getProducts();
}
@DeleteMapping("/DeleteProduct/{id}")
public String DeleteProduct(@PathVariable int id)
{
	return sev.DeleteProduct(id);
}

@PutMapping("/updateProduct")
public Product Update(@RequestBody Product product)
{
	return sev.UpdateProduct(product);
}

}
