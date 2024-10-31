import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String s = scanner.nextLine();

        String vocales = "aeiouAEIOU";
        int mitad = s.length() / 2;

        int contadorA = 0;
        int contadorB = 0;

        int i = 0;
        while (i < s.length()) {
            char letra = s.charAt(i);
            if (vocales.indexOf(letra) != -1) { 
                if (i < mitad) {
                    contadorA++;
                } else {
                    contadorB++;
                }
            }
            i++;
        }
        System.out.println(contadorA == contadorB);


}}
