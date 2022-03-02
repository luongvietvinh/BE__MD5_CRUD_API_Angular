package com.angular_be.reposytory;

import com.angular_be.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepo extends JpaRepository<Users , Long> {
    Users findUsersById(Long id);
}
