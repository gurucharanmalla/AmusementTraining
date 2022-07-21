package com.ap.App.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.App.Entity.Activity;
import com.ap.App.service.IActivityService;

@RestController
@RequestMapping("/app")
@Validated
public class ActivityWebController {

	@Autowired
	IActivityService service;
	
	@PostMapping("/save")
	public Activity  insertActivity(@RequestBody Activity t)
	{
		return service.insertActivity(t);
	}
	
	@PutMapping("/update")
	public Activity  updateActivity(@RequestBody Activity t)
	{
		return service.insertActivity(t);
	}
	
	@DeleteMapping("/dactivity/{activityId}")
	public boolean deleteUserByID(@PathVariable int activityId) {
	
		

			return service.deleteActivity(activityId);	
		
		
		
	}
	
	@GetMapping("/view/")
	public List<Activity> viewActivitiesOfCharges(){
		
		return service.viewActivitiesOfCharges(); 
	}
}
