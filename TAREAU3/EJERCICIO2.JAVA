import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números: ");
        int n = sc.nextInt();
        
        int pares = 0, impares = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        
        
    }
}
