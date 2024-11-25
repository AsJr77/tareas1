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

        System.out.println("Ingresa las filas que deseas intercambiar (0-" + (filas - 1) + "):");
        int fila1 = scanner.nextInt();
        int fila2 = scanner.nextInt();

        for (int j = 0; j < columnas; j++) {
            int temp = matriz[fila1][j];
            matriz[fila1][j] = matriz[fila2][j];
            matriz[fila2][j] = temp;
        }

        System.out.println("Matriz después del intercambio:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
