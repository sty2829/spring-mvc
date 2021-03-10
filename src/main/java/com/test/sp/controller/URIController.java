package com.test.sp.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class URIController {

	private static final Logger log = LoggerFactory.getLogger(URIController.class);
	
	@RequestMapping(value = "/views/**")
	public String goPage(HttpServletRequest request) {
		String uri = request.getRequestURI();
		int idx = uri.indexOf("/", 1);
		uri = uri.substring(idx+1);
		log.info("uri=>{}", uri);
		return uri;
	}
}
