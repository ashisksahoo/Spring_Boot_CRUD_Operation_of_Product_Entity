package com.techpalle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductService extends JpaRepository<Product, Integer> { }
