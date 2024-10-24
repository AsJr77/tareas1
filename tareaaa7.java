import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre (sin números): ");
        String nombre = input.nextLine();

        System.out.println("Ingrese su puntaje crediticio (entre 300 y 850): ");
        int puntajeCrediticio = input.nextInt();

        System.out.println("Ingrese sus ingresos mensuales: ");
        double ingresosMensuales = input.nextDouble();

        System.out.println("Ingrese la cantidad solicitada para el crédito hipotecario: ");
        double cantidadSolicitada = input.nextDouble();

        System.out.println("Ingrese la duración del préstamo en años: ");
        int duracionPrestamo = input.nextInt();

        System.out.println("Ingrese el porcentaje de ahorro personal: ");
        double porcentajeAhorro = input.nextDouble();

        if (!nombre.matches(".*\\d.*")) {
            System.out.println("El nombre no debe contener números.");
            return;
        }

        if (puntajeCrediticio < 300 || puntajeCrediticio > 850) {
            System.out.println("Puntaje crediticio inválido.");
            return;
        }

        double tasaInteres;
        if (puntajeCrediticio < 600) {
            System.out.println("Solicitud rechazada por bajo puntaje crediticio.");
            return;
        } else if (puntajeCrediticio >= 600 && puntajeCrediticio <= 740) {
            tasaInteres = 0.06;
            if (ingresosMensuales < 3 * (calcularCuotaMensual(cantidadSolicitada, tasaInteres, duracionPrestamo))) {
                System.out.println("Solicitud rechazada: los ingresos mensuales no son suficientes.");
                return;
            }
        } else {
            tasaInteres = 0.04;
            if (ingresosMensuales / calcularCuotaMensual(cantidadSolicitada, tasaInteres, duracionPrestamo) < 2.5) {
                System.out.println("Solicitud rechazada: la relación ingreso-cuota es demasiado baja.");
                return;
            }
        }
        double cuotaMensual = calcularCuotaMensual(cantidadSolicitada, tasaInteres, duracionPrestamo);

        double montoTotal = cuotaMensual * duracionPrestamo * 12;

        System.out.println("Nombre: " + nombre);
        System.out.println("Estado de la solicitud: Aprobada");
        System.out.println("Tasa de interés: " + (tasaInteres * 100) + "%");
        System.out.println("Cuota mensual: $" + cuotaMensual);
        System.out.println("Monto total a pagar: $" + montoTotal);
    }

    public static double calcularCuotaMensual(double cantidadSolicitada, double tasaInteres, int duracionPrestamo) {
        double r = tasaInteres / 12;
        int n = duracionPrestamo * 12;
        return (cantidadSolicitada * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }
}
