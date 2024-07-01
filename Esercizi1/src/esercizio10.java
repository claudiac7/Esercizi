import java.util.Scanner;

public class esercizio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proposta del giorno:");
        System.out.println("a. pizza");
        System.out.println("b. penne al pomodoro");
        System.out.println("c. cotoletta e patatine");
        System.out.println("d. crostata e caffè");
        System.out.println();
        System.out.print("Ordine? ");

        String scelta = scanner.next().toLowerCase();

        switch (scelta) {
            case "a":
                System.out.println("Hai ordinato pizza");
                break;
            case "b":
                System.out.println("Hai ordinato penne al pomodoro");
                break;
            case "c":
                System.out.println("Hai ordinato cotoletta e patatine");
                break;
            case "d":
                System.out.println("Hai ordinato crostata e caffè");
                break;
            default:
                System.out.println("Scelta non valida");
        }
        scanner.close();
    }
}