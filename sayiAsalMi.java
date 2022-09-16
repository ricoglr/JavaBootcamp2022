public class sayiAsalMi {
    public static void main(String[] args) {
        
        int number  = 4;
        int result = number%2;
        
        if(number<0){
            System.out.println("Geçersiz Sayı");
        }
        if(result == 0){
            System.out.println("Sayı Asaldır. ");
        } else{
            System.out.println("Sayı Asal Değildir");
        }
    }
}
