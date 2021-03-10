package com.test.sp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.test.sp.dao.EmpDAO;
import com.test.sp.entity.Emp;
import com.test.sp.util.CommonEntityManager;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Override
	public List<Emp> getEmpList() {
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<Emp> eTQ = em.createQuery("from Emp", Emp.class);
		List<Emp> empList = eTQ.getResultList();
		em.close();
		return empList;
	}

	@Override
	public Emp getEmp(long empno) {
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<Emp> eTQ = em.createQuery("from Emp where empno = :empno", Emp.class);
		eTQ.setParameter("empno", empno);
		Emp emp = eTQ.getSingleResult();
		em.close();
		return emp;
	}

	@Override
	public int insertEmp(Emp emp) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			em.persist(emp);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			cnt = 0;
			et.rollback();
		} finally {
			em.close();
		}
		return cnt;
	}

	@Override
	public int updateEmp(Emp emp) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		try {
			et.begin();
			em.merge(emp);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}

	@Override
	public int deleteEmp(long empno) {
		EntityManager em = CommonEntityManager.getEM();
		EntityTransaction et = em.getTransaction();
		int cnt = 1;
		TypedQuery<Emp> eTQ = em.createQuery("from Emp where empno = :empno", Emp.class);
		eTQ.setParameter("empno", empno);
		Emp emp = eTQ.getSingleResult();
		try {
			et.begin();
			em.remove(emp);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
			cnt = 0;
		} finally {
			em.close();
		}
		return cnt;
	}

	public static void main(String[] args) {
		EmpDAO empDAO = new EmpDAOImpl();
		System.out.println(empDAO.getEmpList());
		System.out.println(empDAO.getEmp(3));
		Emp emp = new Emp();
		emp.setName("테스트");
		emp.setSal(3000);
		System.out.println(empDAO.insertEmp(emp));
		System.out.println(empDAO.getEmp(emp.getEmpno()));
		emp.setSal(5000);
		System.out.println(empDAO.updateEmp(emp));
		System.out.println(empDAO.getEmp(emp.getEmpno()));
		
		System.out.println(empDAO.deleteEmp(emp.getEmpno()));
		
	}
}
