import java.util.Scanner;

public class esercizio6_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo reddito: ");
        double reddito = scanner.nextDouble();

        System.out.print("Sei coniugato? (s/n): ");
        char statoCivile = scanner.next().charAt(0);

        double tasse = 0;
        boolean coniugato = (statoCivile == 's' || statoCivile == 'S');
        boolean nonConiugato = (statoCivile == 'n' || statoCivile == 'N');

        if ((coniugato && reddito <= 64000) || (nonConiugato && reddito <= 32000)) {
            tasse = reddito * 0.10;
        } else if ((coniugato && reddito > 64000) || (nonConiugato && reddito > 32000)) {
            tasse = (coniugato ? 64000 : 32000) * 0.10 + (reddito - (coniugato ? 64000 : 32000)) * 0.25;
        } else {
            System.out.println("Stato civile non valido.");
            scanner.close();
            return;
        }

        System.out.println("Le tasse da pagare sono: " + tasse);
        scanner.close();
    }
}