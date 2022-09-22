package Hafta2_Odev2.Methods;

public class Main {
    
    public static void main(String[] args) {
        
        sayiBulmaca();
    }

    public static void sayiBulmaca(){

        int sayilar[] = new int []{1,2,5,7,9};
        int aranacak = 6;
        boolean varMi = false;

        for(int sayi : sayilar){
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi) {
            mesajVer("Sayı Mevcuttur: " + aranacak);
            mesajVer(mesaj);
        }
        else{
            mesajVer("Sayı Mevcut Değildir: " + aranacak);
        }
    }

    public static void mesajVer (String mesaj){
        System.out.println(mesaj);
    }
}