import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ingresa tu nombre:");
        String nombre = input.nextLine();

        System.out.println("Ingresa tu edad:");
        int edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingresa tu país de residencia:");
        String pais = input.nextLine();

        System.out.println("Ingresa tu estado civil (soltero o casado):");
        String estadoCivil = input.nextLine();

        System.out.println("Ingresa tus ingresos anuales:");
        double ingresos = input.nextDouble();

        System.out.println("¿Tienes hijos? (true o false):");
        boolean tieneHijos = input.nextBoolean();


        boolean contieneNumero = false;
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isDigit(nombre.charAt(i))) {
                contieneNumero = true;
                break;
            }
        }


        if (contieneNumero) {
            System.out.println("Error: El nombre no debe contener números.");
        } else {
            if (edad < 25) {
                System.out.println("No eres elegible para beneficios.");
            } else {
                double descuento = 0;
                if (pais.equals("México")) {
                    if (estadoCivisl.equals("casado")) {
                        if (ingresos < 300000) {
                            if (tieneHijos) {
                                descuento = 10;
                            } else {
                                descuento = 5;
                            }
                        }
                    } else {
                        if (ingresos < 400000) {
                            descuento = 8;
                        } else {
                            descuento = 0;
                        }
                    }
                } else {
                    if (pais.equals("USA")) {
                        if (estadoCivil.equals("casado")) {
                            if (ingresos < 500000) {
                                descuento = 12;
                            }
                        } else {
                            if (ingresos < 200000) {
                                descuento = 7;
                            }
                        }

                        if (tieneHijos) {
                            descuento += 3;
                        }
                    } else {
                        if (estadoCivil.equals("casado")) {
                            descuento = 5;
                        } else {
                            descuento = 3;
                        }

                        if (ingresos < 200000) {
                            descuento += 2;
                        }
                    }
                }
                double contribucion = 10000;
                double montoFinal = contribucion - (contribucion * (descuento / 100));
                System.out.println("Eres elegible para un descuento del " + descuento + "%.");
                System.out.println("Tu contribución anual final será de: $" + montoFinal);
            }
        }
        }
}
