package OOP1;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Macbook Pro");
        product1.setPrice(27.900);
        product1.setStock(3);
        product1.setDiscount(7);
        product1.setImgUrl("demo1.jpg");

        Product product2 = new Product();
        product2.setName("Macbook Air");
        product2.setPrice(16.900);
        product2.setStock(7);
        product2.setDiscount(2);
        product2.setImgUrl("demo2.jpg");

        Product product3 = new Product();
        product3.setName("Macbook Pro");
        product3.setPrice(20.100);
        product3.setStock(9);
        product3.setDiscount(2);
        product3.setImgUrl("dem3.jpg");

        Product[] products ={
            product1,
            product2,
            product3
        };

        System.out.println("<ul>");
        for(Product product : products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(0);
        individualCustomer.setPhone("0532 423 52 27");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Bekir");
        individualCustomer.setLastName("Güler");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0551 876 52 91");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("5432");

        Customer[] customers = {
            individualCustomer,
            corporateCustomer
        };
    }
}