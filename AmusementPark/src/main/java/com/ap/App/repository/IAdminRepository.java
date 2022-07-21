package com.ap.App.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ap.App.Entity.Admin;



@Repository
public interface IAdminRepository extends CrudRepository<Admin, Integer>{

}
