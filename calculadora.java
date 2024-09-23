import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
    String[] nombres = new String[3];
    int[] cantidades = new int[3];
    double[] preciosUnitarios = new double[3];
    double[] descuentos = new double[3];
    double[] impuestos = new double[3];

   
    System.out.println("Ingrese el nombre del producto 1: ");
    nombres[0] = input.nextLine();
    System.out.println("Ingrese la cantidad de " + nombres[0] + ": ");
    cantidades[0] = input.nextInt();
    System.out.println("Ingrese el precio unitario de " + nombres[0] + ": ");
    preciosUnitarios[0] = input.nextDouble();
    System.out.println("Ingrese el porcentaje de descuento de " + nombres[0] + " (si no hay descuento, ingrese 0): ");
    descuentos[0] = input.nextDouble();
    System.out.println("Ingrese el porcentaje de impuestos de " + nombres[0] + ": ");
    impuestos[0] = input.nextDouble();
    input.nextLine();  // Limpiar el buffer

    
    System.out.println("Ingrese el nombre del producto 2: ");
    nombres[1] = input.nextLine();
    System.out.println("Ingrese la cantidad de " + nombres[1] + ": ");
    cantidades[1] = input.nextInt();
    System.out.println("Ingrese el precio unitario de " + nombres[1] + ": ");
    preciosUnitarios[1] = input.nextDouble();
    System.out.println("Ingrese el porcentaje de descuento de " + nombres[1] + " (si no hay descuento, ingrese 0): ");
    descuentos[1] = input.nextDouble();
    System.out.println("Ingrese el porcentaje de impuestos de " + nombres[1] + ": ");
    impuestos[1] = input.nextDouble();
    input.nextLine();  // Limpiar el buffer

    
    System.out.println("Ingrese el nombre del producto 3: ");
    nombres[2] = input.nextLine();
    System.out.println("Ingrese la cantidad de " + nombres[2] + ": ");
    cantidades[2] = input.nextInt();
    System.out.println("Ingrese el precio unitario de " + nombres[2] + ": ");
    preciosUnitarios[2] = input.nextDouble();
    System.out.println("Ingrese el porcentaje de descuento de " + nombres[2] + " (si no hay descuento, ingrese 0): ");
    descuentos[2] = input.nextDouble();
    System.out.println("Ingrese el porcentaje de impuestos de " + nombres[2] + ": ");
    impuestos[2] = input.nextDouble();
    input.nextLine();  // Limpiar el buffer

    double totalAcumulado = 0;

    // Calcular los detalles para el primer producto
    double precioTotalSinDescuento1 = cantidades[0] * preciosUnitarios[0];
    double montoDescuento1 = precioTotalSinDescuento1 * (descuentos[0] / 100);
    double precioConDescuento1 = precioTotalSinDescuento1 - montoDescuento1;
    double montoImpuesto1 = precioConDescuento1 * (impuestos[0] / 100);
    double precioTotalAPagar1 = precioConDescuento1 + montoImpuesto1;

    System.out.println("\nProducto: " + nombres[0]);
    System.out.println("Cantidad: " + cantidades[0]);
    System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento1);
    System.out.println("Monto de descuento: $" + montoDescuento1);
    System.out.println("Precio con descuento: $" + precioConDescuento1);
    System.out.println("Impuestos aplicados: $" + montoImpuesto1);
    System.out.println("Precio total a pagar: $" + precioTotalAPagar1);

    totalAcumulado += precioTotalAPagar1;

    // Calcular los detalles para el segundo producto
    double precioTotalSinDescuento2 = cantidades[1] * preciosUnitarios[1];
    double montoDescuento2 = precioTotalSinDescuento2 * (descuentos[1] / 100);
    double precioConDescuento2 = precioTotalSinDescuento2 - montoDescuento2;
    double montoImpuesto2 = precioConDescuento2 * (impuestos[1] / 100);
    double precioTotalAPagar2 = precioConDescuento2 + montoImpuesto2;

    System.out.println("\nProducto: " + nombres[1]);
    System.out.println("Cantidad: " + cantidades[1]);
    System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento2);
    System.out.println("Monto de descuento: $" + montoDescuento2);
    System.out.println("Precio con descuento: $" + precioConDescuento2);
    System.out.println("Impuestos aplicados: $" + montoImpuesto2);
    System.out.println("Precio total a pagar: $" + precioTotalAPagar2);

    totalAcumulado += precioTotalAPagar2;

    // Calcular los detalles para el tercer producto
    double precioTotalSinDescuento3 = cantidades[2] * preciosUnitarios[2];
    double montoDescuento3 = precioTotalSinDescuento3 * (descuentos[2] / 100);
    double precioConDescuento3 = precioTotalSinDescuento3 - montoDescuento3;
    double montoImpuesto3 = precioConDescuento3 * (impuestos[2] / 100);
    double precioTotalAPagar3 = precioConDescuento3 + montoImpuesto3;

    System.out.println("\nProducto: " + nombres[2]);
    System.out.println("Cantidad: " + cantidades[2]);
    System.out.println("Precio total sin descuento: $" + precioTotalSinDescuento3);
    System.out.println("Monto de descuento: $" + montoDescuento3);
    System.out.println("Precio con descuento: $" + precioConDescuento3);
    System.out.println("Impuestos aplicados: $" + montoImpuesto3);
    System.out.println("Precio total a pagar: $" + precioTotalAPagar3);

    totalAcumulado += precioTotalAPagar3;

    // Mostrar el total acumulado
    System.out.println("\nTotal acumulado a pagar por los tres productos: $" + totalAcumulado);
    input.close();

    }
}
