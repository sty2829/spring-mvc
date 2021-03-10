package com.test.sp.dao;

import java.util.List;

import com.test.sp.entity.Emp;

public interface EmpDAO {

	List<Emp> getEmpList();
	
	Emp getEmp(long empno);
	
	int insertEmp(Emp emp);
	
	int updateEmp(Emp emp);
	
	int deleteEmp(long empno);
}
