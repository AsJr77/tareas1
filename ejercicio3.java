
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de elementos del arreglo:");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        int[] frecuencias = new int[n];

        System.out.println("Ingresa " + n + " números:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            frecuencias[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] == arreglo[j]) {
                    frecuencias[i]++;
                    arreglo[j] = Integer.MIN_VALUE; 
                }
            }
        }

        System.out.println("Frecuencia de elementos:");
        for (int i = 0; i < n; i++) {
            if (arreglo[i] != Integer.MIN_VALUE) {
                System.out.println(arreglo[i] + " aparece " + frecuencias[i] + " veces");
            }
        }
    }
}
