import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la base del rettangolo: ");
        double base = scanner.nextDouble();

        System.out.print("Inserisci l'altezza del rettangolo: ");
        double altezza = scanner.nextDouble();

        // Puoi utilizzare i valori inseriti per calcolare l'area o il perimetro del rettangolo
        double area = base * altezza;
        double perimetro = 2 * (base + altezza);

        System.out.println("L'area del rettangolo è: " + area);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        scanner.close();
        }
    }