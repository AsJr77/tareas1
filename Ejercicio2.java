public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50} 
        System.out.println("La media es: " + calcularMedia(numeros));
    }

    public static double calcularMedia(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }
}
