

import javax.management.MBeanRegistrationException;

public class stringsDemo {

	public static void main(String[] args) {
		
		
		String mesaj ="    Bugün hava çok güzel     ";
		System.out.println(mesaj);
				
				System.out.println("Eleman Sayısı:" +  mesaj.length());
				System.out.println("5. Eleman:" +  mesaj.charAt(4));
				System.out.println(mesaj.concat("Yaşasın!"));
			    System.out.println(mesaj.startsWith("B"));
			    System.out.println(mesaj.endsWith("l"));
			    char[] karekterler =new char[5];
				mesaj.getChars(0, 5, karekterler, 0);	
				System.out.println(karekterler);
				System.out.println(mesaj.indexOf('a'));
				System.out.println(mesaj.lastIndexOf('a'));
				
				
				System.out.println(mesaj.replace(' ', '-'));
				String yeniMesaj=(mesaj.replace(' ', '-'));
				System.out.println(yeniMesaj);
				System.out.println(mesaj.substring(2,5));
				
				for(String kelime: mesaj.split(" ")){
				System.out.println(kelime);	
				}
				
				System.out.println(mesaj.toLowerCase());
				System.out.println(mesaj.toUpperCase());
				System.out.println(mesaj.trim());
				
			
	}

}
