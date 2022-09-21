public class inceKalınHarf {
    public static void main(String[] args) {
        char harf = 'K';

        switch (harf) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }
    }
}
