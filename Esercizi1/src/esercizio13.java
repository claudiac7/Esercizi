import java.util.Scanner;

public class esercizio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Eta'?:");
        int eta = scanner.nextInt();

        if (eta >= 0 && eta <= 15) {
            System.out.println(20);
        } else if (eta >= 16 && eta <= 35) {
            System.out.println(10);
        } else if (eta >= 36 && eta <= 48) {
            System.out.println(30);
        } else if (eta >= 49 && eta <= 59) {
            System.out.println(10);
        } else if (eta >= 60 && eta <= 75) {
            System.out.println(20);
        } else if (eta >= 76 && eta <= 80) {
            System.out.println(30);
        } else {
            System.out.println(20);
        }

        scanner.close();
    }
}