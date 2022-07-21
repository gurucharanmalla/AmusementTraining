package com.ap.App.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ap.App.Entity.Activity;

@Service
public interface IActivityService {

	public Activity insertActivity(Activity activity);
	public Activity updateActivity(Activity activity);
	public boolean deleteActivity(int activityId);
	public List<Activity> viewActivitiesOfCharges();
	public int countActivitiesOfCharges(float charges);

}
