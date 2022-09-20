

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		
		
				
		int number =1;
		
		//int remainder =  number % 2;
		//System.out.println(remainder);
		boolean İsPrime = true;
		if (number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		 
		 
		for(int i =2; i<number;i++)
		if (number %i == 0) {
			İsPrime = false;
		}
			
		
		if(İsPrime) {
			System.out.println("Sayı asaldır");
			
		}else {
			System.out.println("Sayı asal değildir");
		}
		
		
		
		
		

	}

}
