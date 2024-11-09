import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuál es su país de residencia? : ");
        String pais = input.nextLine();

        if (pais.equalsIgnoreCase("USA")) {
            System.out.print("Ingrese su código postal: ");
            String codigoPostal = input.nextLine();
            System.out.print("¿Ha realizado compras previas?: ");
            String comprasPrevias = input.nextLine();

            if (codigoPostal.startsWith("9")) {
                if (comprasPrevias.equalsIgnoreCase("si")) {
                    System.out.println("Puede pagar con PayPal.");
                } else {
                    System.out.println("Debe realizar una verificación con su dirección.");
                }
            } else {
                System.out.println("Debe usar tarjeta de crédito.");
            }
        } else if (pais.equalsIgnoreCase("Europa")) {
            System.out.print("Ingrese su código postal: ");
            String codigoPostal = input.nextLine();
            System.out.print("¿Ha realizado compras previas? ");
            String comprasPrevias = input.nextLine();

            if (codigoPostal.length() == 5) {
                if (comprasPrevias.equalsIgnoreCase("si")) {
                    System.out.println("Puede pagar con transferencia bancaria.");
                } else {
                    System.out.println("Debe realizar una verificación bancaria.");
                }
            } else {
                System.out.println("Código postal no válido. Compra rechazada.");
            }
        } else {
            System.out.println("Debe realizar una verificación manual de identidad.");
        }
    }
}