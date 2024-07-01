import java.util.Scanner;

public class esercizio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Voto?\n ");
        int voto = scanner.nextInt();

        char letteraVoto = calcolaVotoInLettere(voto);

        System.out.println(letteraVoto);

        scanner.close();
    }

    public static char calcolaVotoInLettere(int voto) {
        if (voto >= 90) {
            return 'A';
        } else if (voto >= 80) {
            return 'B';
        } else if (voto >= 70) {
            return 'C';
        } else if (voto >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}