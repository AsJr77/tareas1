import java.util.Scanner;

public class DivisoresNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = sc.nextInt();
        
        System.out.print("Divisores de " + n + ": ");
        boolean tieneDivisores = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                tieneDivisores = true;
            }
        }
        
        if (!tieneDivisores) {
            System.out.println("El número no tiene divisores aparte de 1 y él mismo.");
        }
        
    
    }
}