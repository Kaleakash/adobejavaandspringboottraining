package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Emp;
import com.service.EmpService;

@Controller
public class EmpController {

@Autowired
EmpService empService;
	@RequestMapping(value="/open")
	public ModelAndView openForm(Emp emp, ModelMap map){
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
