import java.util.Scanner;

public class esercizio21 {

    public static int euro(double valore) {
        return (int) valore;
    }


    public static int cent(double valore) {
        double centesimi = valore * 100;
        return (int) centesimi % 100;
    }


    public static void stampaEuro(int euro, int cent) {
        System.out.println("Eu" + euro + "." + cent);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci un importo decimale: ");
        double importo = scanner.nextDouble();

        int euroParte = euro(importo);
        int centParte = cent(importo);

        stampaEuro(euroParte, centParte);

        scanner.close();
    }
}
