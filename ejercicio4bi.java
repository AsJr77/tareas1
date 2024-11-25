import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la matriz cuadrada (n):");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("Ingresa los elementos de la matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int sumaPrincipal = 0, sumaSecundaria = 0;
        for (int i = 0; i < n; i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);
    }
}
