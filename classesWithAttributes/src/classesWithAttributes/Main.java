package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product( 1, "Laptop",  "Asus Laptop",  7500, 20);
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
