import java.util.Scanner;

public class esercizio23 {

    public static double celsiusAFahrenheit(double gradi) {
        return (gradi * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double gradi) {
        return (gradi - 32) * 5 / 9;
    }

    public static double cmAInch(double misura) {
        return misura / 2.54;
    }

    public static double inchACm(double misura) {
        return misura * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un valore double: ");
        double valore = scanner.nextDouble();


        System.out.println("Scegli una opzione di conversione:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Centimetri a Pollici");
        System.out.println("4. Pollici a Centimetri");

        int scelta = scanner.nextInt();
        double risultato = 0;

        switch (scelta) {
            case 1:
                risultato = celsiusAFahrenheit(valore);
                System.out.println(valore + " gradi Celsius equivalgono a " + risultato + " gradi Fahrenheit.");
                break;
            case 2:
                risultato = fahrenheitACelsius(valore);
                System.out.println(valore + " gradi Fahrenheit equivalgono a " + risultato + " gradi Celsius.");
                break;
            case 3:
                risultato = cmAInch(valore);
                System.out.println(valore + " centimetri equivalgono a " + risultato + " pollici.");
                break;
            case 4:
                risultato = inchACm(valore);
                System.out.println(valore + " pollici equivalgono a " + risultato + " centimetri.");
                break;
            default:
                System.out.println("Scelta non valida.");
        }
        scanner.close();
    }
}
