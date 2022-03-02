package com.angular_be.reposytory;

import com.angular_be.model.Product;
import com.angular_be.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product , Long> {
    Product findProductById(Long id);

}
