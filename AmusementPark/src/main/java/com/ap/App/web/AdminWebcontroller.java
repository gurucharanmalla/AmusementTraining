package com.ap.App.web;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ap.App.Entity.Activity;
import com.ap.App.Entity.Admin;
import com.ap.App.service.IAdminService;

@RestController
@RequestMapping("/appadmin")
@Validated
@CrossOrigin(origins = "http://localhost:4200")
public class AdminWebcontroller {
	
	@Autowired
	IAdminService service;
	
	
	
	@GetMapping("/allcus/{customerId}")
	public List<Activity> getAllActivitiesofCustomer(@PathVariable int customerId){
		return service.getAllActivitiesofCustomer(customerId);
		
	}
	
	@GetMapping("/actall")
	public List<Activity> getAllActivities(){
		return service.getgetAllActivities();

	}
	
	@GetMapping("/actdat")
	public List<Activity> getActivitiesDatewise(){
		return service.getActivitiesDatewise();
		
	}
	
	@GetMapping("/actday")
	public List<Activity> getAllActivitiesForDays(@RequestParam int customerId,@RequestParam Date fromDate,@RequestParam Date toDate){
		return service.getAllActivitiesForDays(customerId, fromDate, toDate);
		
	}
	
	@PostMapping("/saveAdmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return service.insertAdmin(admin);
	
	
	}
	
	@GetMapping("/view/{adminId}")
	public Admin viewAdmins(@PathVariable int adminId) {
		return service.viewAdmin(adminId);
	}
	
	public Admin updateAdmin(Admin admin) {
		return admin;
	
		
	}

	@DeleteMapping("/deladmin/{adminId}")
	public Admin deleteAdmin(@PathVariable int adminId) {
		return service.deleteAdmin(adminId);
	
	
	}


}
