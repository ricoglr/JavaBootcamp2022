package Hafta2_Odev2.Methods2;

import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        String mesaj= "Bugün hava çok güzel.";
        String yeniMesaj= sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
    }
    
    public static void ekle(){
        System.out.println("EKlendi");
    }

    public static void sil(){
        System.out.println("silindi");
    }

    public static void güncelle(){
        System.out.println("Güncellendi");
        return;
    }

    public static int topla(int x, int y) {
        
        return x+y;
    }

    public static String sehirVer() {
        return "Hatay";
    }
}
