package com.test.sp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.entity.Gugun;
import com.test.sp.entity.Sido;
import com.test.sp.util.CommonEntityManager;

@Controller
public class AddressController {
	
	private static final Logger log = LoggerFactory.getLogger(AddressController.class);
	
	@RequestMapping(value = "/ajax/addr/sidos", method = RequestMethod.GET)
	public @ResponseBody List<Sido> getSidoList(){
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<Sido> tq = em.createQuery("from Sido", Sido.class);
		List<Sido> sidoList = tq.getResultList();
		log.info("시도리스트 => {}", sidoList);
		return sidoList;
	}
	
	@RequestMapping(value = "/ajax/addr/guguns", method = RequestMethod.GET)
	public @ResponseBody List<Gugun> getGugunList(@RequestParam int siNum){
		EntityManager em = CommonEntityManager.getEM();
		TypedQuery<Gugun> tq = em.createQuery("from Gugun where si_num = :siNum", Gugun.class);
		tq.setParameter("siNum", siNum);
		List<Gugun> gugunList = tq.getResultList();
		log.info("구군 => {}" , gugunList);
		return gugunList;
	}
}
