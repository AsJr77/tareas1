
public class Main {
    public static void main(String[] args) {

       String correo = "juan.perez@empresa.com";
       String Fechaascenso = "2023-04-15";
       String salario = "50000.75";

       String nombre = correo.substring(0,10);
    
        //lo investigue la clase para invertir 
       String invertido = new StringBuilder(nombre).reverse().toString();

       String empresa = correo.substring(10,22);

       int a = 2023;
       int b = 04;
       int c = 15;
       int suma = a + b + c;
      //investigue Math.abs
      double salarioo = 50000.75;
      int entero = (int) salarioo;
      double decimal = salarioo - entero;
      double difAbsoluta = Math.abs(entero - decimal);
      difAbsoluta = 74.75;
      double resultadoo = difAbsoluta * 2;
      System.out.println(invertido  + empresa + "|" + suma + "|" + resultadoo);

    }
}
