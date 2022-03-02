package com.angular_be.service;

import com.angular_be.model.Product;
import com.angular_be.model.Users;
import com.angular_be.reposytory.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;

    public List<Product> getAll(){
        return productRepo.findAll();
    }
    public Product save(Product product){
        return productRepo.save(product);
    }
    public Product findById(Long id){
        return productRepo.findById(id).get();
    }
    public void delete(Long id){
        productRepo.deleteById(id);
    }
}
