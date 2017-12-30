package main.java.cn.et.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import main.java.cn.et.hibernate.dao.Food;


public class TestHibernate {
	public static void main(String[] args) {
		updateFood();
	}
	public void saveFood(){
		Session session=HibernateSessionFactory.getSession();
		Food food=new Food();
		food.setFoodid(Integer.valueOf(9));
		food.setFoodname("�㽶");
		food.setImageurl("/a");
		food.setDesce("hehe");
		food.setPrice(Double.valueOf(10));
		session.getTransaction().begin();
		session.save(food);
		session.getTransaction().commit();
	}
	public static void deleteFood(){
		Session session=HibernateSessionFactory.getSession();
		Food food=new Food();
		food.setFoodid(Integer.valueOf(9));
		session.getTransaction().begin();
		session.delete(food);
		session.getTransaction().commit();
		
	}
	public static void queryFood(){
		Session session=HibernateSessionFactory.getSession();
		Food food=(Food) session.load(Food.class, Integer.valueOf(1));
		System.out.println(food.getFoodname());
		
		Query query=session.createQuery("from Food where foodname like:a ");
		query.setString("a", "%ţ%");
		List<Food> foodlist=query.list();
		System.out.println(foodlist.size());
	}
	public static void updateFood(){
		Session session=HibernateSessionFactory.getSession();
		Food food=new Food();
		food.setFoodid(Integer.valueOf(10));
		food.setFoodname("ƻ��");
		food.setImageurl("/a");
		food.setDesce("dfd");
		food.setPrice(Double.valueOf(100));
		session.getTransaction().begin();
		session.update(food);
		session.getTransaction().commit();
		
	}
}
