package test1;

class Student{
	String name;
	int ban, no, kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return (this.kor + this.eng + this.math);
	}
	float getAverage(){
		
		return (int)((this.kor + this.eng + this.math)/3f*10+0.5f)/10f;
	}
	
	String info(){
		return name + ',' + ban + ',' + no + ',' + kor + ',' + eng + ',' + math + ',' + getTotal() + ',' + getAverage(); 
	}
	
}

public class ex6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}

}
