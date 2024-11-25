import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto:");
        String texto = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] arreglo = texto.toCharArray();
        boolean esPalindromo = true;

        for (int i = 0, j = arreglo.length - 1; i < j; i++, j--) {
            if (arreglo[i] != arreglo[j]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
    }
    }
}
