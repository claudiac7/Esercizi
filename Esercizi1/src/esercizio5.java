import java.util.Scanner;

public class esercizio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("parola?");
        String parola = scanner.nextLine();

        String parolaMaiuscolo = parola.toUpperCase();

        System.out.println(parolaMaiuscolo);

        if (parolaMaiuscolo.equals("ASINO") || parolaMaiuscolo.equals("CANE") || parolaMaiuscolo.equals("GATTO")) {
            System.out.println("Hai indovinato!");
        }

        scanner.close();
    }
}