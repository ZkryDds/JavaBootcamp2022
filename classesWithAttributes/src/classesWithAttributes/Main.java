package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.id = 1;
		product.name = "Laptop";
		product.description = "Lenovo laptop";
		product.price = 15000;
		product.stockAmount = 5;
		
		
		System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
	}

}
