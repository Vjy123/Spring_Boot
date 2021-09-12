package com.example.Products.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Products.Model.Product;
import com.example.Products.Repository.PRepo;

@Service
public class PService 
{ 
	@Autowired
	public PRepo rpo;
	 public Product saveProduct(Product product)
	{
		return rpo.save(product);
	}
	public List<Product> saveProducts(List<Product> products)
	{
		return rpo.saveAll(products);
	}
	public List<Product> getProducts()
	{
		return rpo.findAll();
	}
	public Product getProductById(int id)
	{
		return rpo.findById(id).orElse(null);
	}
	public Product getProductByName(String name)
	{
		return  rpo.findByName(name);
	}
	public String DeleteProduct(int id)
	{
		 rpo.deleteById(id);
		return "product is remover..!!!"+id;
	}
	public Product UpdateProduct(Product product)
	{
		Product ep=rpo.getById(product.getId());
		ep.setName(product.getName());
		ep.setQty(product.getQty());
		ep.setPrice(product.getPrice());
		return rpo.save(ep);
	}

}
