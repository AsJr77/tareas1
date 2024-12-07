public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {-10, 15, -20, 30, 5, -1}; //prueba
        System.out.println("Números positivos:");
        imprimirPositivos(numeros);
    }

    public static void imprimirPositivos(int[] numeros) {
        for (int num : numeros) {
            if (num > 0) {
                System.out.println(num);
            }
        }
    }
}
