import java.util.Scanner;

public class esercizio20 {

    public static int rapporto(int n, int m) {
        if (n > m) {
            return n / m;
        } else {
            return m / n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        int risultato = rapporto(num1, num2);

        System.out.println("Il rapporto tra i due numeri è: " + risultato);

        scanner.close();
    }
}
