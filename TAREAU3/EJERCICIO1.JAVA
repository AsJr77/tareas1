import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números: ");
        int cantidad = sc.nextInt();
        
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa un número: ");
            double numero = sc.nextDouble();
            suma += numero;
        }
        
        double promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);
        
        if (promedio > 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        
    
    }
}