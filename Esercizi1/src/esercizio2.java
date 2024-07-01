import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ora inizio:");
        int oraInizio = scanner.nextInt();

        System.out.println("Ora fine:");
        int oraFine = scanner.nextInt();

        if (oraFine < oraInizio) {
            System.out.println("Attenzione, la fine è prima dell'inizio!");
        }

        System.out.println("STOP");

        scanner.close();
    }
}