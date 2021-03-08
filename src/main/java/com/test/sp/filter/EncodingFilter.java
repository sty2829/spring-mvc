package com.test.sp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

    public EncodingFilter() {
    	System.out.println("1.난 메모리 생성될때 딱 1번만 생성됨");
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("난 요청한 url이 내 url패턴과 맞다면 그때마다 실행됨");
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("2. 난 메모리 생성된 후에 실행됨 나도 1번됨");
	}

}
