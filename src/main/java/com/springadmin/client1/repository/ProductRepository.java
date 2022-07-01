package com.springadmin.client1.repository;

import com.springadmin.client1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author PANKAJ JANGID
 * @created 21/06/2022 - 12:17 AM
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
