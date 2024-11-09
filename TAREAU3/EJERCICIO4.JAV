import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();
        
        boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println(n + " es un número primo");
        } else {
            System.out.println(n + " no es un número primo");
        }
        
       
    }
}