import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar información del estudiante
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu número de identificación (ID): ");
        String id = input.nextLine();

        System.out.print("Ingresa tu promedio general: ");
        double promedio = input.nextDouble();

        System.out.print("¿Cuántas materias deseas inscribir?: ");
        int numMaterias = input.nextInt();

        if (promedio < 7.0) {
            System.out.println("Inscripción denegada. El promedio es menor a 7.0.");
        } else if (promedio >= 7.0 && promedio < 8.5) {
            if (numMaterias < 3) {
                System.out.println("Inscripción aprobada.");
            } else {
                System.out.println("Inscripción denegada por sobrecarga académica.");
            }
        } else if (promedio >= 8.5) {

            if (nombre.length() > 25) {
                System.out.println("Por favor, corrige tu nombre. Tiene más de 25 caracteres.");
            }

            else if (id.length() < 8) {
                System.out.println("Inscripción denegada. El ID tiene menos de 8 dígitos.");
            } else {

                if (numMaterias <= 5) {
                    System.out.println("Inscripción aprobada.");
                } else {
                    System.out.print("¿Cuántas materias aprobaste el semestre anterior?: ");
                    int materiasAprobadas = input.nextInt();

                    if (materiasAprobadas > 3) {
                        System.out.println("Inscripción aprobada para hasta 6 materias.");
                    } else {
                        System.out.println("Se te restringe a inscribir solo 5 materias.");
                    }
                }
            }
        }
    }
}