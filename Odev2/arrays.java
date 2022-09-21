public class arrays {
    public static void main(String[] args) {
        
        String ogr1 = "Bekir";
        String ogr2 = "Mehmet";
        String ogr3 = "Osman";
        String ogr4 = "Hakan";

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println(ogr4);
        //bunun daha kısa yolu yok mu :'(

        System.out.println("***************************************");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Fatma";
        ogrenciler[1] = "Ayşe";
        ogrenciler[2] = "Elif";

        for(int i = 0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
    }
}
