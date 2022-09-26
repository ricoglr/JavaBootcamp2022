package Hafta2_Odev2.Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
    
    
    
        Product product = new Product(1,"MacBook","Laptop",5,"Uzay Grisi");
        
        ProductManager productManager = new ProductManager();

        productManager.Add(product);

        System.out.println("--------------------------------------");
    }
}
