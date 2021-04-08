package com.jpa.relation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.relation.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{

}
