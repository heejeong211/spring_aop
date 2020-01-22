package edu.bit.ex;

import org.aspectj.lang.ProceedingJoinPoint;

//xml���������� �̿��� AOP

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable { //��ü �ȿ� �� ProceedingJoinPoint �Լ��� ������� (aop:around ���)
		
		String signatureStr = joinPoint.getSignature().toShortString(); //getStudentInfo(), getWorkerInfo() �Լ��� ���� ��.
		System.out.println(signatureStr + " is start");
		
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinPoint.proceed(); //���������� �ٽɱ��(getStudentInfo(), getWorkerInfo()) �Լ��� �����ϴ� ��. �� ���̻��̿� �������� �����Ű�ڴ�.
			return obj;
		} finally {
			
			long et = System.currentTimeMillis();
			
			System.out.println(signatureStr + " is finished");
			System.out.println(signatureStr + " �ɸ��� �ð� : " + (et - st));
		}
	}
}
