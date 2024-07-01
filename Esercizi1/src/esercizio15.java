import java.util.Scanner;

public class esercizio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        parola = parola.toUpperCase();

        int lunghezza = parola.length();

        int lunghezzaPrimaParte = lunghezza / 2;
        int lunghezzaSecondaParte = lunghezza - lunghezzaPrimaParte;

        String primaParte = parola.substring(0, lunghezzaPrimaParte);
        String secondaParte = parola.substring(lunghezzaPrimaParte);

        System.out.println(primaParte);
        System.out.println(secondaParte);

        scanner.close();
    }
}