package com.cors.lhj.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = StringUtils.defaultString(request.getRemoteAddr());
		String uri = StringUtils.defaultString(req.getRequestURI());
		String url = StringUtils.defaultString(req.getRequestURL().toString());
		String queryString = StringUtils.defaultString(req.getQueryString());
		String referer = StringUtils.defaultString(req.getHeader("referer"));
		String agent = StringUtils.defaultString(req.getHeader("user-Agent"));
	
		/*
		System.out.println("*****remoteAddr :" + remoteAddr);
		System.out.println("*****uri : " + uri);
		System.out.println("*****url : " + url);
		System.out.println("*****queryString " + queryString);
		System.out.println("*****referer : " + referer);
		System.out.println("*****agernt : " + agent);
		*/
		StringBuffer sb = new StringBuffer();
		sb.append(" | ").append(remoteAddr).append(uri)
		.append("(").append(url).append("?")
		.append(queryString).append(")")
		.append(referer).append(" | ").append(agent);		
		
		logger.info("LOG FILTER : " + sb);
		
		
		
		chain.doFilter(req, response);				//chain.doFilter - 조작한 내용을 req에 담아서 넘긴다
													//filter의 역할은 request들어온것을 중간에 무언가 한후 response로 넘긴다.
	}

	@Override
	public void destroy() {

	}

}
