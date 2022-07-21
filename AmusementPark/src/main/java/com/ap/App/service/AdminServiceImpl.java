package com.ap.App.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.App.Entity.Activity;
import com.ap.App.Entity.Admin;
import com.ap.App.repository.IAdminCustomRepository;
import com.ap.App.repository.IAdminRepository;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminRepository repository;
	
	@Autowired
	IAdminCustomRepository repo;
	
	@Override
	public List<Activity> getAllActivitiesofCustomer(int customerId) {
		// TODO Auto-generated method stub
		return repo.getAllActivitiesofCustomer(customerId);
	}

	@Override
	public List<Activity> getgetAllActivities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activity> getActivitiesDatewise() {
		// TODO Auto-generated method stub
		return repo.getActivitiesDatewise();
	}

	@Override
	public List<Activity> getAllActivitiesForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		 repository.deleteById(adminId);
		return null;
		 
	}

	@Override
	public Admin viewAdmin(int adminId) {
		// TODO Auto-generated method stub
		return repository.findById(adminId).get();
	}

}
