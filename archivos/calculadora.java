import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] nombres = new String[3];
        int[] cantidades = new int[3];
        double[] preciosUnitarios = new double[3];
        double[] descuentos = new double[3];
        double[] impuestos = new double[3];

        // Solicitar los datos para cada producto
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = input.nextLine();
            System.out.println("Ingrese la cantidad de " + nombres[i] + ": ");
            cantidades[i] = input.nextInt();
            System.out.println("Ingrese el precio unitario de " + nombres[i] + ": ");
            preciosUnitarios[i] = input.nextDouble();
            System.out.println("Ingrese el porcentaje de descuento de " + nombres[i] + " (si no hay descuento, ingrese 0): ");
            descuentos[i] = input.nextDouble();
            System.out.println("Ingrese el porcentaje de impuestos de " + nombres[i] + ": ");
            impuestos[i] = input.nextDouble();
            input.nextLine();
        }

        double totalAcumulado = 0;
        for (int i = 0; i < 3; i++) {
            double precioTotalSinDescuento = cantidades[i] * preciosUnitarios[i];
            double montoDescuento = precioTotalSinDescuento * (descuentos[i] / 100);
            double precioConDescuento = precioTotalSinDescuento - montoDescuento;
            double montoImpuesto = precioConDescuento * (impuestos[i] / 100);
            double precioTotalAPagar = precioConDescuento + montoImpuesto;

            System.out.println("\nProducto: " + nombres[i]);
            System.out.println("Cantidad: " + cantidades[i]);
            System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento);
            System.out.println("Monto de descuento: $" + montoDescuento);
            System.out.println("Precio con descuento: $" + precioConDescuento);
            System.out.println("Impuestos aplicados: $" + montoImpuesto);
            System.out.println("Precio total a pagar: $" + precioTotalAPagar);

            totalAcumulado += precioTotalAPagar;
        }

        System.out.println("\nTotal acumulado a pagar por los tres productos: $" + totalAcumulado);
        input.close();




    }
}