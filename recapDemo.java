public class recapDemo {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 30;
        int sayi3 = 10;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk= sayi3;
        }

        System.out.println("En Büyük Sayı:"+ enBuyuk);
    }
}
