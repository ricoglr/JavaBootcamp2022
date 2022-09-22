package Hafta2_Odev2.Classes;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------");

        //reference type
        CustomerManager customerManager = new CustomerManager();
        
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1=30;
        System.out.println(sayi2);

        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};

        numbers2 = numbers1;
        numbers1[0]=10;
        System.out.println(numbers2[0]);

        System.out.println("--------------------------------");
    }
}
