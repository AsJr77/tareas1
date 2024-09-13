import com.sun.nio.sctp.SctpStandardSocketOptions;

import javax.net.ssl.SSLContext;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      // Solicitar datos de domicilio
      System.out.println("Ingrese los datos de domicilio:");
      System.out.print("Calle: ");
      String calle = input.nextLine(); // Usar Input para la entrada de datos
      System.out.print("Número: ");
      String numeroDomicilio = input.nextLine();
      System.out.print("Colonia: ");
      String colonia = input.nextLine();
      System.out.print("Ciudad: ");
      String ciudad = input.nextLine();
      System.out.print("Código Postal: ");
      String codigoPostal = input.nextLine();

      // Imprimir domicilio
      System.out.println("\nDomicilio completo:");
      System.out.println("Calle: " + calle);
      System.out.println("Número: " + numeroDomicilio);
      System.out.println("Colonia: " + colonia);
      System.out.println("Ciudad: " + ciudad);
      System.out.println("Código Postal: " + codigoPostal);

      // Solicitar datos escolares
      System.out.println("\nIngrese los datos de escolaridad:");

      System.out.println("Primaria:");
      System.out.print("  Escuela: ");
      String escuelaPrimaria = input.nextLine();
      System.out.print("  Ubicación: ");
      String ubicacionPrimaria = input.nextLine();
      System.out.print("  Fechas (inicio-fin): ");
      String fechasPrimaria = input.nextLine();

      System.out.println("Secundaria:");
      System.out.print("  Escuela: ");
      String escuelaSecundaria = input.nextLine();
      System.out.print("  Ubicación: ");
      String ubicacionSecundaria = input.nextLine();
      System.out.print("  Fechas (inicio-fin): ");
      String fechasSecundaria = input.nextLine();

      System.out.println("Preparatoria:");
      System.out.print("  Escuela: ");
      String escuelaPreparatoria = input.nextLine();
      System.out.print("  Ubicación: ");
      String ubicacionPreparatoria = input.nextLine();
      System.out.print("  Fechas (inicio-fin): ");
      String fechasPreparatoria = input.nextLine();

      
      // Solicitar datos del deporte favorito
      System.out.println("\nIngrese los datos de su deporte favorito:");
      System.out.print("Deporte: ");
      String deporteFavorito = input.nextLine();
      System.out.print("Posición favorita: ");
      String posicionFavorita = input.nextLine();
      System.out.print("Equipo favorito: ");
      String equipoFavorito = input.nextLine();
      System.out.print("Jugador favorito: ");
      String jugadorFavorito = input.nextLine();
      System.out.print("Frecuencia de juego: ");
      String frecuenciaJuego = input.nextLine();
      System.out.print("Tiempo jugando: ");
      String tiempoJugando = input.nextLine();

      System.out.println("\nDatos de su deporte favorito:");
      System.out.println("Deporte: " + deporteFavorito);
      System.out.println("Posición favorita: " + posicionFavorita);
      System.out.println("Equipo favorito: " + equipoFavorito);
      System.out.println("Jugador favorito: " + jugadorFavorito);
      System.out.println("Frecuencia de juego: " + frecuenciaJuego);
      System.out.println("Tiempo jugando: " + tiempoJugando);




    }
}