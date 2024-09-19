import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Ingresar coordenadas
        System.out.print("Ingresa coordenada x del primer punto: ");
        double x1 = input.nextDouble();
        System.out.print("Ingresa coordenada y del primer punto: ");
        double y1 = input.nextDouble();
        System.out.print("Ingresa coordenada x del segundo punto: ");
        double x2 = input.nextDouble();
        System.out.print("Ingresa coordenada y del segundo punto: ");
        double y2 = input.nextDouble();

        // Calcular distancia
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Calcular ángulo en radianes
        double anguloRadianes = Math.atan2(y2 - y1, x2 - x1);

        // Convertir ángulo a grados
        double anguloGrados = Math.toDegrees(anguloRadianes);

        // Mostrar resultados
        System.out.println("Distancia: " + distancia);
        System.out.println("Ángulo en radianes: " + anguloRadianes);
        System.out.println("Ángulo en grados: " + anguloGrados);



    }
}
