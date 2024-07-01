import java.util.Scanner;

public class esercizio18 {

    public static void saluto(String nome, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Buongiorno, " + nome);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        
        saluto(nome, numero);

        scanner.close();
    }
}
