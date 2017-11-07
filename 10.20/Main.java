package test1;

abstract class Starcraft{
	abstract void attack();
}

class Protoss extends Starcraft{
	
	@Override
	public void attack(){
		System.out.println("프로토스의 공격");
	}
}

class Terran extends Starcraft{
	
	@Override
	public void attack(){
		System.out.println("테란의 공격");
	}
}

class Zerg extends Starcraft{
	
	@Override
	public void attack(){
		System.out.println("저그의 공격");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Terran marine = new Terran();
		marine.attack();
		Protoss dragoon = new Protoss();
		dragoon.attack();
		Zerg hydralisk = new Zerg();
		hydralisk.attack();
		System.out.println("====객체 형변환과 오버라이딩을 이용 ====");
		Starcraft obj = new Terran();
		
		obj.attack();
		obj = new Protoss();
		obj.attack();
		obj = new Zerg();
		obj.attack();
		
		
		
		
		
		
	}

}
