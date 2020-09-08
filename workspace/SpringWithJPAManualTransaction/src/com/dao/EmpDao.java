package com.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Emp;

@Repository												//@Repository Dao layer specific 
public class EmpDao {

	//1st Way to do the operation
	/*@Autowired
	EntityManagerFactory emf;
	public boolean storeEmpDao(Emp emp){
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			manager.persist(emp);
			tran.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
	}
	*/
	//2nd Way to do the operation
	@PersistenceUnit				//DI 
	EntityManagerFactory factory;				//Connection con 
	
	
	public boolean storeEmpDao(Emp emp){
		try {
			EntityManager manager = factory.createEntityManager();	//PreparedStatement
			EntityTransaction tran = manager.getTransaction();
				tran.begin();
								manager.persist(emp); //insert query 
				tran.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
	}
	
}
