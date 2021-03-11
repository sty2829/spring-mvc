package com.test.sp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Data;

@Data
class BreadVO{
	private String name;
	private Integer price;
	private List<String> interest;
}


@Controller
public class JsonController {
	
	private static final Logger log = LoggerFactory.getLogger(JsonController.class);

	@RequestMapping(value = "/ajax/list", method = RequestMethod.GET)
	public @ResponseBody List<BreadVO> ajax(){
		List<BreadVO> breadList = new ArrayList<>();
		BreadVO breadVO = new BreadVO();
		breadVO.setName("식빵");
		breadVO.setPrice(3000);
		breadList.add(breadVO);
		breadVO = new BreadVO();
		breadVO.setName("피자빵");
		breadVO.setPrice(3000);
		breadList.add(breadVO);
		return breadList;
	}
	
	@RequestMapping(value ="/ajax/check", method = RequestMethod.GET)
	public @ResponseBody int ajax2(@RequestParam List<String> interest, String name, String price) {
		log.info("니가 보낸 관심사 =>{}", name);
		log.info("니가 보낸 관심사 =>{}", price);
		log.info("니가 보낸 관심사 =>{}", interest);
		return 1;
	}
	
	@RequestMapping(value ="/ajax/check1", method = RequestMethod.GET)
	public @ResponseBody int ajax3(BreadVO bread) {
		log.info("파라미터 => {}", bread);
		return 1;
	}
	
	@RequestMapping(value="/ajax/check", method = RequestMethod.POST)
	public @ResponseBody String ajaxPost(@RequestBody BreadVO bread) {
		log.info("파라미터 => {}", bread);
		return "hello";
	}
	

}
