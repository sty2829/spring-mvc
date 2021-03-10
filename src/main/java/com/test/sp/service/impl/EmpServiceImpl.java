package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.EmpDAO;
import com.test.sp.entity.Emp;
import com.test.sp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO empDAO; 

	@Override
	public List<Emp> getEmpList() {
		return empDAO.getEmpList();
	}

	@Override
	public Emp getEmp(long empno) {
		return empDAO.getEmp(empno);
	}

	@Override
	public int insertEmp(Emp emp) {
		return empDAO.insertEmp(emp);
	}

	@Override
	public int updateEmp(Emp emp) {
		return empDAO.updateEmp(emp);
	}

	@Override
	public int deleteEmp(long empno) {
		return empDAO.deleteEmp(empno);
	}

}
