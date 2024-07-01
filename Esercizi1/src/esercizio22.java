import java.util.Scanner;

public class esercizio22 {

    public static int giorno(String data) {
        String[] partiData = data.split("/");
        return Integer.parseInt(partiData[0]);
    }

    public static int mese(String data) {
        String[] partiData = data.split("/");
        return Integer.parseInt(partiData[1]);
    }

    public static int anno(String data) {
        String[] partiData = data.split("/");
        return Integer.parseInt(partiData[2]);
    }

    public static boolean isBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean giornoOk(int giorno, int mese, int anno) {
        if (mese < 1 || mese > 12) {
            return false;
        }

        int giorniNelMese;
        switch (mese) {
            case 1, 3, 5, 7, 8, 10, 12:
                giorniNelMese = 31;
                break;
            case 4, 6, 9, 11:
                giorniNelMese = 30;
                break;
            case 2:
                giorniNelMese = isBisestile(anno) ? 29 : 28;
                break;
            default:
                return false;
        }

        return giorno >= 1 && giorno <= giorniNelMese;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una data nel formato gg/mm/aaaa: ");
        String dataInserita = scanner.nextLine();

        int giorno = giorno(dataInserita);
        int mese = mese(dataInserita);
        int anno = anno(dataInserita);

        boolean dataValida = giornoOk(giorno, mese, anno);

        if (dataValida) {
            System.out.println("Data valida");
        } else {
            System.out.println("Data non valida");
        }

        scanner.close();
    }
}
