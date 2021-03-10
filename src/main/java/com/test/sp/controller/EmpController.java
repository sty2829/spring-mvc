package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.entity.Emp;
import com.test.sp.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value = "/emps", method = RequestMethod.GET)
	public @ResponseBody List<Emp> getEmpList(){
		return empService.getEmpList();
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public @ResponseBody Emp getEmp(@RequestParam Long empno) {
		return empService.getEmp(empno);
	}
}
