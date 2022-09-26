package Hafta2_Odev2.Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
    
    
    
        Product product = new Product();

        product.setId(0);
        product.setName("MacBook Pro");
        product.setDescription("Laptop");
        product.setPrice(27.100);
        product.setStock(5);

        /*
        System.out.println("Product ID ---> " + product.id);
        System.out.println("Product Name ---> " + product.name);
        System.out.println("Product Description ---> " + product.description);
        System.out.println("Product Price ---> " + product.price);
        System.out.println("Product Stock ---> " + product.stock);
        */

        ProductManager productManager = new ProductManager();
        productManager.Add(product);



        System.out.println("--------------------------------------");
    }
    
}
