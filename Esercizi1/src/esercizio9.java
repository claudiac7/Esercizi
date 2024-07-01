import java.util.Scanner;

public class esercizio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Giorno?");
        int giorno = scanner.nextInt();
        System.out.println("Mese?");
        int mese = scanner.nextInt();

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
            case 3:  numeroGiornoAnno += 28;
            case 2:  numeroGiornoAnno += 31;
        }

        numeroGiornoAnno += giorno;

        System.out.println("Numero del giorno dell'anno: " + numeroGiornoAnno);
    }
}