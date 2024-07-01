import java.util.Scanner;

public class esercizio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("numero?");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " è pari");
        } else {
            System.out.println(n + " è dispari");
        }

        scanner.close();
    }
}