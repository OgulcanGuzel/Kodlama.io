package Prod;

public class Main {

	public static void main(String[] args) {
		
		//Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 2, "kırmızı", 0);
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);
		product.setRenk("kırmızı");
		product.setKod(123);
		
	
		
		
		
		
	
		
		
		
		ProductManager produtcManager = new ProductManager();
		produtcManager.Add(product);
		System.out.println(product.getKod());
		
		
		
	}

}
