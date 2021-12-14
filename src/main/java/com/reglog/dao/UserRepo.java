package com.reglog.dao;

import com.reglog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<User, Integer>
{
    public User getByEmail(String email);


}