package OOP1;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.name = "Macbook Pro";
        product1.price = 27.900;
        product1.stock = 3;
        product1.discount = 7;
        product1.imgUrl = "demo.jpg";

        Product product2 = new Product();
        product1.name = "Macbook Pro";
        product1.price = 16.900;
        product1.stock = 7;
        product1.discount = 2;
        product1.imgUrl = "demo2.jpg";

        Product product3 = new Product();
        product1.name = "Macbook Pro";
        product1.price = 20.100;
        product1.stock = 9;
        product1.discount = 2;
        product1.imgUrl = "dem3.jpg";

        Product[] products ={
            product1,
            product2,
            product3
        };

        System.out.println("<ul>");
        for(Product product : products){
            System.out.println("<li>" + product.name + "</li>");
        }
        System.out.println("</ul>");
        
    }
}