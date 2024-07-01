import java.util.Scanner;

public class esercizio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();

        String carattereCentrale = trovaCarattereCentrale(parola);
        System.out.println("Carattere/i centrale/i: " + carattereCentrale);

        scanner.close();
    }

    public static String trovaCarattereCentrale(String parola) {
        int lunghezza = parola.length();

        if (lunghezza == 0) {
            return "";
        }

        int indiceCentrale = lunghezza / 2;

        if (lunghezza % 2 == 0) {
            return parola.substring(indiceCentrale - 1, indiceCentrale + 1);
        } else {
            return parola.substring(indiceCentrale, indiceCentrale + 1);
        }
    }
}