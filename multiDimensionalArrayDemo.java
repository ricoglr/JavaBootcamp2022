//Çok Boyutlu Dizilerle Çalışmak
public class multiDimensionalArrayDemo {

    public static void main(String[] args) {
        String[][] motorlar = new String[3][3];

        motorlar[0][0]="Yamaha";
        motorlar[0][1]="Kawasaki";
        motorlar[0][2]="Suzuki";
        motorlar[1][0]="BMW";
        motorlar[1][1]="Honda";
        motorlar[1][2]="Ducati";
        motorlar[2][0]="Duke";
        motorlar[2][1]="Nuke";
        motorlar[2][2]="KTM";

        for(int i=0; i<=2;i++){
            System.out.println("-----------");
            for(int j=0;j<=2;j++){
                System.out.println(motorlar[i][j]);
            }
        }

    }
}