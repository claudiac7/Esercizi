import java.util.Scanner;

public class esercizio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Prima parola? ");
        String parola1 = scanner.nextLine();

        System.out.print("Seconda parola? ");
        String parola2 = scanner.nextLine();

        if (parola1.compareTo(parola2) < 0) {
            System.out.println(parola1);
        } else {
            System.out.println(parola2);
        }

        scanner.close();
    }
}