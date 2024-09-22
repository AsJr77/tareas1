public class Main {
    public static void main(String[] args) {



      String palabraEjercicio = "Garcia, Juan Carlos";

      //longitud
      int longitud = palabraEjercicio.length();
      System.out.println("longitud: " + longitud);

      //apellido
      String CeroSiete = palabraEjercicio.substring(0,6);
      System.out.println("Apellido: " + CeroSiete);

      //nombre sin apellido
      String palabra = "Garcia, Juan Carlos";
      String palabraCortada = palabra.substring(8);
      System.out.println("nombre sin apellido: " + palabraCortada);

      //primer nombre
      String OchoTrece = palabraEjercicio.substring(8,13);
      System.out.println("primer nombre: " + OchoTrece);

      //mayusculas
      String apellido = palabraEjercicio.substring(0, 6).toUpperCase();
      System.out.println("apellido en mayusculas: " + apellido);

      //minusculas
      String minusculas = palabraEjercicio.toLowerCase();
      System.out.println("nombre completo en minusculas: " + minusculas);

      //caracter de posicion 5
      char posCinco = palabraEjercicio.charAt(4);
      System.out.println("Caracter en la posicion 5: " + posCinco);

      //primera ocurrencia de a
       String palabraNueva = "Garcia, Juan Carlos";
       int primerOcurrencia = palabraNueva.indexOf('a');
      System.out.println("Primera ocurrecia de a: " + primerOcurrencia);

      //ultima ocurrencia de a
      String otraPalabra =  "Garcia, Juan Carlos";
      int ultimaOcurrencia = otraPalabra.lastIndexOf('a') + 1;
      System.out.println("ultima ocurrencia de a: " + ultimaOcurrencia);

    }
}
