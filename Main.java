import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Introduce las coordenadas del primer punto (x1, y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Introduce las coordenadas del segundo punto (x2, y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Introduce las coordenadas del tercer punto (x3, y3):");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //  longitudes de los lados del triángulo
        double lado1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double lado2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double lado3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // perímetro del triángulo
        double perimetro = lado1 + lado2 + lado3;

        // área del triángulo utilizando la fórmula de Herón
        double s = perimetro / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));


        //altura del triángulo desde el primer vértice
        double altura = (2 * area) / lado1;

        // ángulos internos del triángulo utilizando la ley de los cosenos
        double anguloA = Math.toDegrees(Math.acos((Math.pow(lado2, 2) + Math.pow(lado3, 2) - Math.pow(lado1, 2)) / (2 * lado2 * lado3)));
        double anguloB = Math.toDegrees(Math.acos((Math.pow(lado1, 2) + Math.pow(lado3, 2) - Math.pow(lado2, 2)) / (2 * lado1 * lado3)));
        double anguloC = Math.toDegrees(Math.acos((Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3, 2)) / (2 * lado1 * lado2)));

        // Verificar si el triángulo es equilátero
        boolean esEquilatero = (lado1 == lado2) && (lado2 == lado3);

        // punto medio de cada lado del triángulo
        double puntoMedio1X = (x1 + x2) / 2;
        double puntoMedio1Y = (y1 + y2) / 2;
        double puntoMedio2X = (x2 + x3) / 2;
        double puntoMedio2Y = (y2 + y3) / 2;
        double puntoMedio3X = (x3 + x1) / 2;
        double puntoMedio3Y = (y3 + y1) / 2;


        System.out.println("Lado A: " + lado1);
        System.out.println("Lado B: " + lado2);
        System.out.println("Lado C: " + lado3);
        System.out.println();
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println();
        System.out.println("Área del triángulo: " + area);
        System.out.println();
        System.out.println("Altura desde el vértice (x1, y1): " + altura);
        System.out.println();
        System.out.println("Ángulo A: " + anguloA + " grados");
        System.out.println("Ángulo B: " + anguloB + " grados");
        System.out.println("Ángulo C: " + anguloC + " grados");
        System.out.println();
        System.out.println("¿El triángulo es equilátero? " + esEquilatero);
        System.out.println();
        System.out.println("Punto medio del lado AB: (" + puntoMedio1X + ", " + puntoMedio1Y + ")");
        System.out.println("Punto medio del lado BC: (" + puntoMedio2X + ", " + puntoMedio2Y + ")");
        System.out.println("Punto medio del lado CA: (" + puntoMedio3X + ", " + puntoMedio3Y + ")");

    }
}
