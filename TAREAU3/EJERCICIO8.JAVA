import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número para la tabla de multiplicar: ");
        int numero = sc.nextInt();
        System.out.print("Ingresa el rango: ");
        int rango = sc.nextInt();
        
        for (int i = 1; i <= rango; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
       
    }
}