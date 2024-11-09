import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántas personas se hospedarán?: ");
        int personas = input.nextInt();
        input.nextLine();
        System.out.print("¿Prefiere suite o estándar?: ");
        String preferencia = input.nextLine();
        System.out.print("¿Cuántas noches será la estadía?: ");
        int noches = input.nextInt();

        if (personas == 1) {
            if (preferencia.equalsIgnoreCase("suite")) {
                System.out.print("¿Hay suites disponibles?: ");
                input.nextLine();
                String haySuite = input.nextLine();

                if (haySuite.equalsIgnoreCase("si")) {
                    if (noches > 3) {
                        System.out.println("Se le ofrece un descuento del 10% en la suite.");
                    } else {
                        System.out.println("Se le ofrece una habitación estándar.");
                    }
                } else {
                    System.out.println("No hay suites disponibles. Se le asigna una habitación estándar.");
                }
            } else {
                System.out.println("Se le asigna una habitación estándar.");
            }
        } else if (personas >= 2) {
            if (preferencia.equalsIgnoreCase("suite")) {
                System.out.print("¿Hay suites disponibles?  ");
                input.nextLine();
                String haySuite = input.nextLine();

                if (haySuite.equalsIgnoreCase("si")) {
                    if (noches > 5) {
                        System.out.println("Se le ofrece un paquete con desayuno incluido.");
                    } else {
                        System.out.println("Se le ofrece la suite sin paquete.");
                    }
                } else {
                    System.out.println("No hay suites disponibles. Se le asigna una habitación doble estándar.");
                }
            } else {
                System.out.println("Se le asigna una habitación doble estándar.");
            }
        }

    }
}