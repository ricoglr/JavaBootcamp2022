public class switchDemo {
    public static void main(String[] args) {
        char grade = 'X';

        switch (grade) {
            case 'A':
                System.out.println("Tebrikler : Geçtiniz");
                break;
            case 'B':
                System.out.println("Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'D':
                System.out.println("Maalesef : Kaldınız");
                break;
        
            default:
                System.out.println("Geçersiz Not Girdiniz");
                break;
        }
    }
}
