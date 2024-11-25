import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número de filas:");
        int filas = scanner.nextInt();
        System.out.println("Ingresa el número de columnas:");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingresa los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int mayor = matriz[0][0];
        int filaMayor = 0, columnaMayor = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }

        System.out.println("El mayor elemento es " + mayor + " en la posición [" + filaMayor + "][" + columnaMayor + "].");
    }
}
