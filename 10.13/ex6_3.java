package test1;

class Student {
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal(){
		return (this.kor + this.eng + this.math);
	}
	float getAverage(){
		
		return (int)((this.kor + this.eng + this.math)/3f*10+0.5f)/10f;
	}
	
}

public class ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " +s.name);
		System.out.println("���� : " +s.getTotal());
		System.out.println("��� : " +s.getAverage());
		
		
		
	}

}
