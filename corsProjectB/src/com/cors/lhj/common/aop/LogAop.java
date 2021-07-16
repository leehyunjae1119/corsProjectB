package com.cors.lhj.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {
	public void before(JoinPoint join) { // 해당 메소드 앞에 붙는다.!!
		Logger logger = LoggerFactory.getLogger(join.getTarget() + "");
		logger.info("-------loger start-------");
		Object args[] = join.getArgs();
		if (args != null) {
			logger.info("Method:\t" + join.getSignature().getName());
			for (int i = 0; i < args.length; i++) {
				logger.info(i + "번 째 :\t" + args[i]);
			}
		}
		/*
		 * .getTarget() : 대상 객체 
		 * .getArgs() : 대상 파라미터 
		 * .getSignature() : 대상 정보
		 */
	}

	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget() + "");
		logger.info("-------logger end-------");

	}

	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget() + "");
		logger.info("에러 : \t" + join.getArgs());
		logger.info("에러 : \t" + join.toString());
	}
}
/*
 * LOG4J 의 인터페이스가 SLF4J 이라고 생각하면 편하다.
 * 
 * log4j의 로그 레벨(내림차순)
 * FATAL : 치명적인 에러
 * ERROR : 에러 출력
 * WARN : 경고 출력
 * INFO : 기본정보 출력
 * DEBUG : 상세정보 출력
 */
