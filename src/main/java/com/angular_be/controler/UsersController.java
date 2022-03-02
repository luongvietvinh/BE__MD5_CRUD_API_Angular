package com.angular_be.controler;

import com.angular_be.model.Users;
import com.angular_be.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Users>> getUserAll() {
        return new ResponseEntity<>(usersService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id) {
        return new ResponseEntity<>(usersService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Users> create(@RequestBody Users users) {
        return new ResponseEntity<>(usersService.save(users), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Users> editUser(@RequestBody Users users) {
        return new ResponseEntity<>(usersService.save(users), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        usersService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
