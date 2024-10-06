public class Main {
    public static void main(String[] args) {

        String nombreDelCliente = "Carlos Martinez";
        String DireccionIP = "192.168.0.1";
        int NumeroCliente = 12345;

        String nombreSOLO = nombreDelCliente.substring(0,6);
        String cifrado = nombreSOLO
               .replace("a","1")
               .replace("e","2")
               .replace("i","3")
               .replace("o", "4")
               .replace("u","5");

        String apellidoSolo = nombreDelCliente.substring(7);
        String cifrado2 = apellidoSolo
                .replace("a","1")
                .replace("e","2")
                .replace("i","3")
                .replace("o","4")
                .replace("u","5");

        char primerL = cifrado.charAt(0);
        char ultimo = cifrado2.charAt(cifrado2.length()-1);
        String nombreF = cifrado.replace(primerL , ultimo);
        String apellidoF = cifrado2.replace(ultimo , primerL);

        String nombree3 = nombreF + " "+ apellidoF;

        

        String hexagesi = Integer.toHexString(192);
        String hexagesi2 = Integer.toHexString(168);
        String hexagesi3 = Integer.toHexString(0);
        String hexagesi4 = Integer.toHexString(1);

        String res = hexagesi + "." + hexagesi2 + "." + hexagesi3 + "." + hexagesi4;

        double clientee = (NumeroCliente * 3 + 15) / 2;

        System.out.println("Datos cifrados: " + nombree3 + "|" + res + "|" + clientee);

        


    }
}
