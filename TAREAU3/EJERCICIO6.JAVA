import java.util.Scanner;

public class NumeroPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();
        
        int invertido = 0, original = numero;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        
        if (original == invertido) {
            System.out.println(original + " es un número palíndromo");
        } else {
            System.out.println(original + " no es un número palíndromo");
        }
        
        
    }
}