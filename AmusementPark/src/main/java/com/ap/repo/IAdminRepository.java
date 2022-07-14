package com.ap.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ap.Entity.Activity;
import com.ap.Entity.Admin;

@Repository
public interface IAdminRepository {
	
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(int adminId);
	public List<Activity> getAllActivities(int customerId);
	public List<Activity> getAllActivities();
	public List<Activity> getActivitiesCustomerwise();
	public List<Activity> getActivitiesDatewise();
	public List<Activity> getAllActivitiesForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate);

}
