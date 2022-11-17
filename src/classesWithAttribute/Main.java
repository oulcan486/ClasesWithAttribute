package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product product=new Product();
        product.setName("Laptop");
        product.setDescription("Toshiba");;
        product.setId(1);;
        product.setUnitsInStock(4);;
        product.setPrice(4500);
        System.out.println(product.getKod());
        
        Product product2=new Product(1,"Bilgisayar", "Asus", 5000, 6, "Siyah");
        product2.getId();
        System.out.println(product2.getName());
        System.out.println(product2.getDescription());
        
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
	}

}
