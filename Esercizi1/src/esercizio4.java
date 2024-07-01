import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        String parolaMaiuscola = parola.toUpperCase();

        char ultimaLettera = parolaMaiuscola.charAt(parolaMaiuscola.length() - 1);

        switch (ultimaLettera) {
            case 'A':
                System.out.println(parolaMaiuscola + " termina con 'a', probabilmente è femminile singolare");
                break;
            case 'E':
                System.out.println(parolaMaiuscola + " termina con 'e', probabilmente è femminile plurale");
                break;
            case 'O':
                System.out.println(parolaMaiuscola + " termina con 'o', probabilmente è maschile singolare");
                break;
            case 'I':
                System.out.println(parolaMaiuscola + " termina con 'i', probabilmente è maschile plurale");
                break;
            default:
                break;
        }

        scanner.close();
    }
}