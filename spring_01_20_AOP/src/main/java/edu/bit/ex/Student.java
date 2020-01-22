package edu.bit.ex;

public class Student { //핵심기능
	
	private String name;
	private int age;
	private int gradeNum;
	private int classNum;
	
	public Student() {
		
	}
	
	//LogAdvice logAdvice = new LogAdvice(); //원래라면 이렇게 해야 함.
	
	public void getStudentInfo() {
		
		//logAdvice.printLogging(); //원래라면 이렇게 해야 함. -aop:before을 했기 때문에 여기에 함수가 집어넣어짐(공통기능)
		
		System.out.println("이름은 : " + getName());
		System.out.println("나이는 : " + getAge());
		System.out.println("학년은 : " + getGradeNum());
		System.out.println("반은 : " + getClassNum());
		
		//logAdvice.printLogging(); //원래라면 이렇게 해야 함. -aop:after을 했기 때문에 여기에 함수가 집어넣어짐(공통기능)
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	

}
