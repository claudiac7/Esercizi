import java.util.Scanner;

public class esercizio9_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Giorno?");
        int giorno = scanner.nextInt();
        System.out.println("Mese?");
        int mese = scanner.nextInt();
        System.out.println("Anno?");
        int anno = scanner.nextInt();

        if (!isValidDate(giorno, mese, anno)) {
            System.out.println("Data non valida.");
            return;
        }

        boolean bisestile = (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
        int numeroGiornoAnno = 0;

        switch (mese) {
            case 12: numeroGiornoAnno += 30;
            case 11: numeroGiornoAnno += 31;
            case 10: numeroGiornoAnno += 30;
            case 9:  numeroGiornoAnno += 31;
            case 8:  numeroGiornoAnno += 31;
            case 7:  numeroGiornoAnno += 30;
            case 6:  numeroGiornoAnno += 31;
            case 5:  numeroGiornoAnno += 30;
            case 4:  numeroGiornoAnno += 31;
            case 3:  numeroGiornoAnno += (bisestile ? 29 : 28);
            case 2:  numeroGiornoAnno += 31;
        }

        numeroGiornoAnno += giorno;

        System.out.println("Numero del giorno dell'anno: " + numeroGiornoAnno);
    }

    public static boolean isValidDate(int giorno, int mese, int anno) {
        if (mese < 1 || mese > 12) return false;
        if (giorno < 1) return false;

        switch (mese) {
            case 4:
            case 6:
            case 9:
            case 11:
                return giorno <= 30;
            case 2:
                if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
                    return giorno <= 29;
                } else {
                    return giorno <= 28;
                }
            default:
                return giorno <= 31;
        }
    }
}