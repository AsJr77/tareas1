import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        String acronimo = "";


        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (i == 0 || nombreCompleto.charAt(i - 1) == ' ') {
                acronimo += nombreCompleto.charAt(i);
            }
        }

        System.out.println("Acrónimo: " + acronimo.toUpperCase());



    }}
