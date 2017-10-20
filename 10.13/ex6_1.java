package test1;

class SutdaCard{
	int num=0;
	boolean isKwang=false;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	 String info(){

         if(isKwang){

                    return num+"K";

         }else{

                    return Integer.toString(num); 
         }
	 }

	
}


class ex6_1{

	
	public static void main(String args[]) {
	
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
        System.out.println(card2.info());



	}

}

