package test1;

abstract class Starcraft{
	abstract void attack();
}

class Protoss extends Starcraft{
	
	@Override
	public void attack(){
		System.out.println("�����佺�� ����");
	}
}

class Terran extends Starcraft{
	
	@Override
	public void attack(){
		System.out.println("�׶��� ����");
	}
}

class Zerg extends Starcraft{
	
	@Override
	public void attack(){
		System.out.println("������ ����");
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
		System.out.println("====��ü ����ȯ�� �������̵��� �̿� ====");
		Starcraft obj = new Terran();
		
		obj.attack();
		obj = new Protoss();
		obj.attack();
		obj = new Zerg();
		obj.attack();
		
		
		
		
		
		
	}

}
