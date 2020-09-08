package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Emp;
import com.service.EmpService;

@Controller														//@Controller is a Controller specific annotation.
public class EmpController {

@Autowired
EmpService empService;
	
	@RequestMapping(value="/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping(value="/open")
	public ModelAndView openForm(Emp emp, ModelMap map,HttpServletRequest req){
		ModelAndView mav = new ModelAndView();
				map.addAttribute("emp", emp);
		mav.setViewName("emp.jsp");
		return mav;
	}
	@RequestMapping(value="/store")
	public ModelAndView storeEmp(Emp emp, ModelMap map){
		ModelAndView mav = new ModelAndView();
		boolean res = empService.empStoreService(emp);
		
		
		
		mav.setViewName("emp.jsp");
		map.addAttribute("emp", emp);
		if(res){
			map.addAttribute("msg", "Record stored successfully...");
		}else {
			map.addAttribute("msg", "Record not stored...");
		}
		return mav;
	}
}
