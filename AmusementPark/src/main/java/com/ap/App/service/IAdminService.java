package com.ap.App.service;

import java.util.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ap.App.Entity.Activity;
import com.ap.App.Entity.Admin;
import com.ap.App.dto.AdminSavePostDto;

@Service
public interface IAdminService {

	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(int adminId);
	public Admin viewAdmin(int adminId);
	public List<Activity> getAllActivitiesofCustomer(int customerId);
	public List<Activity> getgetAllActivities();
	public List<Activity> getActivitiesDatewise();
	public List<Activity> getAllActivitiesForDays(int customerId, Date fromDate,Date toDate);

}
