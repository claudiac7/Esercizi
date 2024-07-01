import java.util.Scanner;

public class esercizio19 {

    public static int areaRettangolo(int base, int altezza) {
        return base * altezza;
    }

    public static int areaQuadrato(int lato) {
        return areaRettangolo(lato, lato);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        int areaRett = areaRettangolo(base, altezza);
        System.out.println("L'area del rettangolo è: " + areaRett);

        System.out.print("Inserisci il lato del quadrato: ");
        int lato = scanner.nextInt();

        int areaQuad = areaQuadrato(lato);
        System.out.println("L'area del quadrato è: " + areaQuad);

        scanner.close();
    }
}
