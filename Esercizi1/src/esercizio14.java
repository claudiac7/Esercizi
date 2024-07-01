import java.util.Scanner;

public class esercizio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        if (parola.length() == 1) {
            System.out.println("*");
        } else if (parola.length() >= 2) {
            String parolaMaiuscola = parola.toUpperCase();
            String nuovaParola = "*" + parolaMaiuscola.substring(1, parolaMaiuscola.length() - 1) + "*";
            System.out.println(nuovaParola);
        }

        scanner.close();
    }
}