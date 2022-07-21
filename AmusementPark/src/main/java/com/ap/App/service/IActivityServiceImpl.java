package com.ap.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.App.Entity.Activity;
import com.ap.App.repository.IActivityRepository;

@Service
public class IActivityServiceImpl {
	@Autowired
	IActivityRepository actrepo;
	
	@Autowired
	//ActivityDTOConversionClass dtoconv;
	
	
	
	//@Override
	/*public ActivityBasicInfoDto insertActivity(ActivitySavePostDto actdto) {
		// TODO Auto-generated method stub
		Activity a=dtoconv.getActivityfromPostActivityDTO(actdto);
		Activity saveobj=actrepo.save(a);
		
		ActivityBasicInfoDto obj=dtoconv.getActivityBasicInfoDTO(saveobj);
		
		return obj;
	}
	
*/
	public Activity insertActivity(Activity activity) {
		// TODO Auto-generated method stub
		return actrepo.save(activity);
	}
	
	public Activity updateActivity(Activity activity) {
		// TODO Auto-generated method stub
		return actrepo.save(activity);
	}

	public boolean deleteActivity(int activityId) {
		// TODO Auto-generated method stub
		actrepo.deleteById(activityId);
		return true;
	}

	public List<Activity> viewActivitiesOfCharges() {
		// TODO Auto-generated method stub
		
		/*Optional<Activity> l1=(Optional<Activity>) actrepo.findById(charges);
		return l1;*/
		List<Activity> l=(List<Activity>) actrepo.findAll();
		return l;
		//return null;
	}

	
	public int countActivitiesOfCharges(float charges) {
		// TODO Auto-generated method stub
		return 0;
	}
}
