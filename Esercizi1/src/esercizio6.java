import java.util.Scanner;

public class esercizio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo reddito: ");
        double reddito = scanner.nextDouble();

        System.out.print("Sei coniugato? (s/n): ");
        char statoCivile = scanner.next().charAt(0);

        double tasse = 0;

        if (statoCivile == 's' || statoCivile == 'S') {
            if (reddito <= 64000) {
                tasse = reddito * 0.10;
            } else {
                tasse = 64000 * 0.10 + (reddito - 64000) * 0.25;
            }
        } else if (statoCivile == 'n' || statoCivile == 'N') {
            if (reddito <= 32000) {
                tasse = reddito * 0.10;
            } else {
                tasse = 32000 * 0.10 + (reddito - 32000) * 0.25;
            }
        } else {
            System.out.println("Stato civile non valido.");
            scanner.close();
            return;
        }

        System.out.println("Le tasse da pagare sono: " + tasse);
        scanner.close();
    }
}