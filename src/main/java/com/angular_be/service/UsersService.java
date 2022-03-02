package com.angular_be.service;

import com.angular_be.model.Users;
import com.angular_be.reposytory.IUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    IUsersRepo usersRepo;

    public List<Users> getAll(){
        return usersRepo.findAll();
    }
    public Users save(Users users){
        return usersRepo.save(users);
    }
    public Users findById(Long id){
        return usersRepo.findUsersById(id);
    }
    public void delete(Long id){
        usersRepo.deleteById(id);
    }
}
