package com.ap.App.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ap.App.Entity.Activity;

@Repository
public class AdminCustomRepositoryImpl implements IAdminCustomRepository {

	@Autowired
	EntityManager entityManager;

	@SuppressWarnings("deprecation")
	@Override
	public List<Activity> getAllActivitiesofCustomer(int customerId) {
		Session session = entityManager.unwrap(Session.class);
		
		String queryString = "select ticketId,activity from  Ticket t where t.customer.customerId =: customerId";
	//	SELECT * from ticket  join  activity on ticket.activity_activity_id = activity.activity_id where ticket.customer_customer_id = 1;
		//"from  Ticket t join Activity a  ON t.activity.activity_id = a.activity_id where t.customer.customer_id=:customerId";
		@SuppressWarnings("unchecked")
		Query<Activity> query = session.createQuery(queryString);
		query.setInteger("customerId", customerId);
List<Activity>  list = (List<Activity>)query.getResultList();
		
		// code to fetch data from DB using JPQL
		
if(list != null)
{
	return list;
}
else
{
	throw new javax.persistence.NoResultException("No activities ");
}

	}



	@Override
	public List<Activity> getActivitiesDatewise() {
Session session = entityManager.unwrap(Session.class);
		
		String queryString = "select ticketId,date,activity from  Ticket t ORDER BY t.date ";
	//	SELECT * from ticket  join  activity on ticket.activity_activity_id = activity.activity_id where ticket.customer_customer_id = 1;
		//"from  Ticket t join Activity a  ON t.activity.activity_id = a.activity_id where t.customer.customer_id=:customerId";
		@SuppressWarnings("unchecked")
		Query<Activity> query = session.createQuery(queryString);
List<Activity>  list = (List<Activity>)query.getResultList();
		
		// code to fetch data from DB using JPQL
		
	return list;
	}



	@Override
	public List<Activity> getAllActivitiesForDays(int customerId, Date fromDate, Date toDate){
Session session = entityManager.unwrap(Session.class);
		
		String queryString = "select ticketId,date,activity from  Ticket t where t.customer.customerId=:customerId and t.date between ?:fromDate and ?:toDate ";
	//	SELECT ticket_id, activity_activity_id, customer_customer_id, date
	//	FROM public.ticket where customer_customer_id = 1 and date  between '01-01-2022' and '30-12-2022'  ;
		@SuppressWarnings("unchecked")
		Query<Activity> query = session.createQuery(queryString);
		query.setInteger("customerId", customerId);
		query.setDate(1, fromDate);
		query.setDate(2, toDate);
		
List<Activity>  list = (List<Activity>)query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("No activities ");
		}
	}
	

	
}
