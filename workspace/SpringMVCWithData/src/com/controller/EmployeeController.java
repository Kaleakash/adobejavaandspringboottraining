package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
@SessionAttributes("empObj")
public class EmployeeController {

	@RequestMapping(value="open")
	public ModelAndView openForm(Employee emp) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("empObj", emp);
		mav.setViewName("emp.jsp");
		return mav;
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="storeEmp",method=RequestMethod.POST)
	public ModelAndView storeEmployee(@ModelAttribute("empObj") Employee emp) {
		ModelAndView mav = new ModelAndView();
		int res = employeeService.storeEmployee(emp);
		if(res>0) {
			mav.addObject("msg", "Record stored");
		}else {
			mav.addObject("msg","Record not stored");
		}
		mav.setViewName("emp.jsp");
		return mav;
	}
	@RequestMapping(value="display")
	public ModelAndView displayAllRec() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		mav.addObject("listOfRec", employeeService.listOfRec());
		return mav;
		
	}
}
