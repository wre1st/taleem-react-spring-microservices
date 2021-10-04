package com.bean.taleem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.taleem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
