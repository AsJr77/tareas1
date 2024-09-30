public class Main {
    public static void main(String[] args) {

        String palabra = "12345;Laptop HP Pavilion;1500.99;Electrónica";

        int longitud = palabra.length() - 2;
        System.out.println("longitud de la cadena: " + longitud );

        String palabraCortada = palabra.substring(0,5);
        System.out.println("ID del producto: " + palabraCortada);

        String palabraCortada2 = palabra.substring(6,24);
        System.out.println("Nombre del producto: " + palabraCortada2);

        String mayusculas = palabraCortada2.toUpperCase();
        System.out.println("Nombre en mayúsculas: " + mayusculas );

        String Precio = palabra.substring(25,32);
        System.out.println("Precio del producto: " + Precio);

        char posDiez = palabraCortada2.charAt(10);
        System.out.println("Carácter en la posición 10 del nombre: " + posDiez);

        int primeraOcurrecia = palabraCortada2.indexOf('a');
        System.out.println("Primera ocurrencia de 'a' en el nombre : " + primeraOcurrecia);

        int UltimaOcurrencia = palabraCortada2.lastIndexOf('o');
        System.out.println("Ultima ocurrencia de 'o' en el nombre: " + UltimaOcurrencia);

        String nuevo = "12345;Laptop HP Pavilion;1500.99;Electrónica";
        String primer = nuevo.substring(25,32);
        String segundo = nuevo.substring(33,44);
        System.out.println("precio y categoria: " + primer + "-" + segundo);
        
        String Subcadena = palabraCortada2.substring(7,18);
        System.out.println("Subcadena desde la posición 7 del nombre: " + Subcadena);
        
    }
}

