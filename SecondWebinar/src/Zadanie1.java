import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Czesc");
        System.out.println("Ile masz lat?");
        Scanner scanner = new Scanner(System.in);
        int wiekUzytkownika = scanner.nextInt();
        wiekUzytkownika++;
        System.out.println("Za rok będziesz mial " + wiekUzytkownika + " lat");



    }
}
