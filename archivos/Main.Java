import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        List<Integer> numeros = new ArrayList<>();

        // 1. lista de 10 números aleatorios entre 1 y 100
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100) + 1);  // Genera un número aleatorio entre 1 y 100
        }

        // 2. raíz cuadrada de cada número
        List<Double> raicesCuadradas = new ArrayList<>();
        for (int numero : numeros) {
            raicesCuadradas.add(Math.sqrt(numero));
        }

        // 3.  cada número al cuadrado
        List<Double> cuadrados = new ArrayList<>();
        for (int numero : numeros) {
            cuadrados.add(Math.pow(numero, 2));
        }

        // 4.  media
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double media = suma / numeros.size();

        // 5. desviación estándar
        double sumaDesviacion = 0;
        for (int numero : numeros) {
            sumaDesviacion += Math.pow(numero - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumaDesviacion / numeros.size());


        System.out.println("=== Resultados ===\n");
        System.out.println("Lista original de números: ");
        System.out.println(numeros + "\n");
        System.out.println("Raíces cuadradas: ");
        System.out.println(raicesCuadradas + "\n");
        System.out.println("Números elevados al cuadrado: ");
        System.out.println(cuadrados + "\n");
        System.out.println("Media: ");
        System.out.println(media + "\n");
        System.out.println("Desviación estándar: ");
        System.out.println(desviacionEstandar + "\n");


    }
}