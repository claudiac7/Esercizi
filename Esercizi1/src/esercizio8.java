import java.util.Scanner;

public class esercizio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("numero?");
        int numero = scanner.nextInt();

        if (numero % 3 == 0) {
            System.out.print("Fizz ");
        }

        if (numero % 5 == 0) {
            System.out.print("Buzz");
        }

        if (numero % 3 != 0 && numero % 5 != 0) {
            System.out.print(numero);
        }

        System.out.println();
    }
}