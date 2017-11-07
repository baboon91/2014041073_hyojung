package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee{
	private String empNo;
	private String name;
	private String part;
	
	public Employee(){
		
	}
	
	public Employee(String empNo, String name, String part){
		this.empNo = empNo;
		this.name = name;
		this.part = part;
		
	}
	
	public String getEmpNo(){
		return empNo;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPart(){
		return part;
	}
	public void setEmpNo(String empNo){
		this.empNo = empNo;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPart(String part){
		this.part = part;
	}
	
	public String resultStr(){
		String result = "";
		
		result += "사번 : "  + empNo + "\n";
		result += "이름 : "  + name + "\n";
		result += "부서 : "  + part + "\n";
		
		return result;
	}
	
	
}

class Manager extends Employee{
	private String position;
	
	public Manager(String empNo, String name, String part, String position){
		//setEmpNo(empNo);
		//setName(name);
		//setPart(part);
		super(empNo, name, part);
		this.position = position;
		
	}
	/*
	public String addStr(){
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;
	}
	*/
	public String resultStr(){
		String result = super.resultStr();
		result += "직책 : " + position + "\n";
		return result;

	}

}
public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = "";
		Employee obj = null;
		//Employee emp = null; // Employee객체의 레퍼런스 변수
		Manager mng = null; // Manager객체의 레퍼런스 변수
		String empNo = null; // 사원번호를 입력받는 변수
		String name = null; // 이름을 입력받는 변수
		String part = null; // 부서를 입력받는 변수
		String position = null; // 직책을 입력받는 변수
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("사번 입력(예)A1010 : ");
			empNo = in.readLine();
			System.out.print("이름 입력(예)박문석 :");
			name = in.readLine();
			System.out.print("부서 입력(예)기획 :");
			part = in.readLine();
			System.out.print("직책 입력(예)사원-1, 대리-2, 과장-3 :");
			position = in.readLine();
		}catch(Exception e){
			System.out.println("입력 오류");
		}
		if(position.equals("1")){
			//emp = new Employee(empNo, name, part);
			//result += emp.resultStr();
			obj = new Employee(empNo, name, part);
			result += obj.resultStr();
		}else {
			position = (position.equals("2"))? "대리":"과장";
			//mng = new Manager(empNo, name, part, position);
			//result += mng.resultStr() + mng.addStr();
			//result += mng.addStr();
			//result += mng.resultStr();
			obj = new Manager(empNo, name, part, position);
			result += obj.resultStr();
		}
		
		System.out.println(result);
		
	}

}
