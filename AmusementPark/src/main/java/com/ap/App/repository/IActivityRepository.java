package com.ap.App.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ap.App.Entity.Activity;

@Repository
public interface IActivityRepository extends CrudRepository<Activity, Integer> {

}
