package test1;

class Product{
	int price; 
	int bonusPoint; 
	
	Product(){}           // Product 클래스에 기본생성자가 없기때문에 오류 발생
	
	Product(int price) {
				this.price = price;
				bonusPoint =(int)(price/10.0);
		}
	}

class Tv extends Product {
	Tv() {}
	
			public String toString() {
				return "Tv";
		}
	}



public class ex_7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		
		
	}

}
