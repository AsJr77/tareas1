import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("¿Es ciudadano o residente? : ");
        String esCiudadano = input.nextLine();

        if (esCiudadano.equalsIgnoreCase("si")) {
            System.out.println("Es elegible para cualquier puesto.");
        } else {
            System.out.print("¿Tiene una visa de trabajo válida? : ");
            String visaValida = input.nextLine();

            if (visaValida.equalsIgnoreCase("si")) {
                System.out.print("¿Cuántos años de experiencia tiene?: ");
                int experiencia = input.nextInt();

                if (experiencia >= 5) {
                    System.out.println("Es elegible para un empleo calificado.");
                } else {
                    System.out.println("Es elegible solo para empleos no calificados.");
                }
            } else {
                System.out.println("No es elegible para el empleo.");
            }
        }

            }
        }

