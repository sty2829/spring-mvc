package com.test.sp.service;

import java.util.List;

import com.test.sp.entity.Emp;

public interface EmpService {

	List<Emp> getEmpList();
	
	Emp getEmp(long empno);
	
	int insertEmp(Emp emp);
	
	int updateEmp(Emp emp);
	
	int deleteEmp(long empno);
}
