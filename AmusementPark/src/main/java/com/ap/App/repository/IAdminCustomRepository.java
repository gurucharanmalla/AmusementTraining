package com.ap.App.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ap.App.Entity.Activity;

@Repository
public interface IAdminCustomRepository {

	public List<Activity> getAllActivitiesofCustomer(int customerId);
	public List<Activity> getActivitiesDatewise();
	public List<Activity> getAllActivitiesForDays(int customerId, LocalDateTime fromDate,LocalDateTime toDate);
}
