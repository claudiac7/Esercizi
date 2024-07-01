import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String nome = scanner.nextLine();

        if (nome.equals("Gianni")) {
            System.out.println("Ciao, Gianni!");
        } else {
            System.out.println("Non ti conosco");
        }

        scanner.close();
    }
}