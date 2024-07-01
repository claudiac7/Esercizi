import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("parola?");
        String parola = scanner.nextLine();

        String parolaMaiuscola = parola.toUpperCase();

        if (parola.length() < 5) {
            System.out.println(parolaMaiuscola + " ha meno di 5 caratteri");
        } else if (parola.length() == 5) {
            System.out.println(parolaMaiuscola + " ha esattamente 5 caratteri");
        } else {
            System.out.println(parolaMaiuscola + " ha piu' di 5 caratteri");
        }

        scanner.close();
    }
}