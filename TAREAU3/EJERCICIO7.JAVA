import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroSimple {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;  // Número aleatorio entre 1 y 100
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adivina el número entre 1 y 100");
        int intento = 0;
        
        while (intento != numeroSecreto) {
            System.out.print("Ingresa tu intento: ");
            intento = sc.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor");
            }
        }
        
        System.out.println("¡Felicidades! Adivinaste el número.");
        
    }
}