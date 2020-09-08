package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Emp;
import com.dao.EmpDao;
@Service								//@Service Service layer specific annotation 
public class EmpService {
@Autowired
EmpDao empDao;


public boolean empStoreService(Emp emp ){
	return empDao.storeEmpDao(emp);
}
}
