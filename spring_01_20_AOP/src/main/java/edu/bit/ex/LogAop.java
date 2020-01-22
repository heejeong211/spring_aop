package edu.bit.ex;

import org.aspectj.lang.ProceedingJoinPoint;

//xml설정파일을 이용한 AOP

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable { //객체 안에 이 ProceedingJoinPoint 함수를 집어넣음 (aop:around 사용)
		
		String signatureStr = joinPoint.getSignature().toShortString(); //getStudentInfo(), getWorkerInfo() 함수를 끌고 옴.
		System.out.println(signatureStr + " is start");
		
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinPoint.proceed(); //실질적으로 핵심기능(getStudentInfo(), getWorkerInfo()) 함수가 실행하는 곳. 이 사이사이에 공통기능을 실행시키겠다.
			return obj;
		} finally {
			
			long et = System.currentTimeMillis();
			
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " 걸리는 시간 : " + (et - st));
		}
	}
}
