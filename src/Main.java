
import org.lessons.java.geometria.rettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        rettangolo rettangolo = new rettangolo(base, altezza);

        int area = rettangolo.calcolaArea();
        int perimetro = rettangolo.calcolaPerimetro();

        System.out.println("L'area del rettangolo è: " + area);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        scanner.close();
    }
}
