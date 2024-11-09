import java.util.Scanner;

public class FibonacciHastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número límite para la serie de Fibonacci: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: ");
        while (a <= n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        
    
    }
}