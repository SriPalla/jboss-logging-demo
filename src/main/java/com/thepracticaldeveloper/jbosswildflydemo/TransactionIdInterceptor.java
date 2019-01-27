package com.thepracticaldeveloper.jbosswildflydemo;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TransactionIdInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MDC.put("x-transaction-id", UUID.randomUUID().toString());
		log.info("##########TransactionIdInterceptor###################");
		return super.preHandle(request, response, handler);
	}
}
