public class doWhileLoop {
    public static void main(String[] args) {
        
        /*

         döngüden önce değişkeni tanımla 
         do{
            döngü sırasında çalışacak olan fonksiyonları yaz.
         }while(şartı yaz)

         */
        
        int i=100;

        do {
            System.out.println(i);
            i+=2;
        } while (i<10);
        System.out.println("Döngü Bitti");
    }
}
