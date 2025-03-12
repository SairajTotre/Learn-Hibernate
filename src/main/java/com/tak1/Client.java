package com.tak1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();//it reads the hibernate.cfg,xml file
		System.out.println("welcome ");
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//select * from mobile where id=?
		Mobile  mobile =session.load(Mobile.class, 1);
		System.out.println(mobile);
		
		
		//insert into mobile values(?,?,?)
//		Mobile mobile2=new Mobile(5,"samsung",23000.90);
//		session.save(mobile2);
//		session.beginTransaction().commit();
		
//		Mobile mb=new Mobile(5,"poco",50000);
	//	session.saveOrUpdate(mb);
		//session.beginTransaction().commit();
		
		Mobile mm=new Mobile(5);
		session.delete(mm);
	   session.beginTransaction().commit();
		
		Criteria criteria=session.createCriteria(Mobile.class);
	//	criteria.add(Restrictions.eq("mobCost", 12000.00));
	//	criteria.add(Restrictions.gt("mobCost", 12000.00));
		//criteria.add(Restrictions.lt("mobCost", 45000.00));
	//	criteria.add(Restrictions.like("brandName", "a%"));
		//criteria.addOrder(Order.desc("mobId"));
		criteria.addOrder(Order.desc("mobCost"));
		 System.out.println(3);
		 List<Mobile> ll=criteria.list();
		 System.out.println(4);
		 for (Mobile mmm : ll) {
			System.out.println(mmm);
		}
		
	}

}
