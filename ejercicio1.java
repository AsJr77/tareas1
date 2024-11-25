import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificaciones = new double[10];
        double suma = 0;

        System.out.println("Ingresa las calificaciones de 10 estudiantes:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        int arribaPromedio = 0, abajoPromedio = 0;

        for (double calificacion : calificaciones) {
            if (calificacion > promedio) arribaPromedio++;
            else if (calificacion < promedio) abajoPromedio++;
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Estudiantes arriba del promedio: " + arribaPromedio);
        System.out.println("Estudiantes debajo del promedio: " + abajoPromedio);
    }
}
