package com.example.Products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Products.Model.Product;

public interface PRepo extends JpaRepository<Product,Integer> {

	Product findByName(String name);




}
