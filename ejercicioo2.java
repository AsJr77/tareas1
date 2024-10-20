import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el tipo de membresía (Premium, Estándar, Básica): ");
        String membresia = input.nextLine();

        System.out.println("Ingresa tu edad:");
        int edad = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el evento que desea asistir (nacional o internacional):");
        String evento = input.nextLine();

        if (membresia.equalsIgnoreCase("Premium")) {

            if (edad < 18) {
                if (evento.equalsIgnoreCase("internacional")) {
                    System.out.println("Compra negada para eventos internacionales.");
                } else {
                    System.out.println("Compra permitida para eventos nacionales.");
                }
            } else if (edad >= 18 && edad < 25) {
                if (evento.equalsIgnoreCase("internacional")) {
                    System.out.println("Descuento del 20% en eventos internacionales.");
                } else if (evento.equalsIgnoreCase("nacional")) {
                    System.out.println("Descuento del 10% en eventos nacionales.");
                }
            } else if (edad >= 25) {
                if (evento.equalsIgnoreCase("internacional")) {
                    System.out.println("Descuento del 25% en eventos internacionales.");
                } else if (evento.equalsIgnoreCase("nacional")) {
                    System.out.println("Descuento del 15% en eventos nacionales.");
                }
            }
        } else if (membresia.equalsIgnoreCase("Estándar")) {

            if (edad < 18 && evento.equalsIgnoreCase("internacional")) {
                System.out.println("Compra negada para eventos internacionales.");
            } else if (edad >= 18) {
                if (evento.equalsIgnoreCase("internacional")) {
                    System.out.println("No tiene descuentos en eventos internacionales.");
                } else if (evento.equalsIgnoreCase("nacional")) {
                    System.out.println("Descuento del 5% en eventos nacionales.");
                }
            }
        } else if (membresia.equalsIgnoreCase("Básica")) {

            if (evento.equalsIgnoreCase("internacional")) {
                System.out.println("No tiene derecho a comprar boletos para eventos internacionales.");
            } else {
                System.out.println("No tiene derecho a descuentos.");
            }
        } else {
            System.out.println("Tipo de membresía no reconocida.");
        }

    }

}
