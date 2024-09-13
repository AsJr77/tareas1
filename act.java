import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
       nextLine -> String
       nextInt-> int
       nextDouble -> doubles
       nextBoolean -> boolean
         */

        // Pedir los 5 números al usuario
        System.out.print("Introduce el valor de numeroUno (int): ");
        int numeroUno = input.nextInt();
        System.out.print("Introduce el valor de numeroDos (int): ");
        int numeroDos = input.nextInt();
        System.out.print("Introduce el valor de numeroTres (int): ");
        int numeroTres = input.nextInt();
        System.out.print("Introduce el valor de numeroCuatro (double): ");
        double numeroCuatro = input.nextDouble();
        System.out.print("Introduce el valor de numeroCinco (double): ");
        double numeroCinco = input.nextDouble();


        double numeradorSuperior = (numeroUno / numeroCuatro) * ((numeroTres + numeroDos) / numeroCinco);
        double denominadorSuperior = (numeroDos + numeroTres) * numeroCuatro;
        double numeradorInferior = (numeroCinco / numeroUno) + (numeroDos /numeroTres) - numeroCuatro;
        double denominadorInferior = numeroUno + numeroDos + numeroTres;
        double resultadoFinal = (numeradorSuperior / denominadorSuperior) / (numeradorInferior / denominadorInferior);
        System.out.println(resultadoFinal);




    }
}
