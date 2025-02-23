package com.bar.demo.repository;

import com.bar.demo.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import java.math.BigDecimal;

@Repository


public interface ProductRepository extends CrudRepository <Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product>findProductByPriceInRange(BigDecimal mixPrice,BigDecimal maxPrice);

    List<Product> findProductByPriceBetween(BigDecimal mixPrice, BigDecimal maxPrice);
}
