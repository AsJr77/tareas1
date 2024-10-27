
public class Main {
    public static void main(String[] args) {
        //1
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //2
        int sum = 0;
        int numero = 1;
        while (numero <= 10) {
            sum += numero;
            numero++;
        }
        System.out.println("La suma es: " + sum);

        //3
        int num = 12345;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("El número tiene " + count + " dígitos.");

        //4
        int num1 = 2;
        while (num1 <= 20) {
            System.out.println(num1);
            num1 += 2;
        }

        //5
        int numm = 12345;
        int sum1 = 0;
        while (numm != 0) {
            sum1 += numm % 10;
            numm /= 10;
        }
        System.out.println("La suma de los dígitos es: " + sum1);

        //6
        int n = 3;
        int l = 30;
        int i1 = n;
        while (i1 <= l) {
            System.out.println(i1);
            i1 += n;
        }
        //7
        int num4 = 123456;
        int sum4 = 0;
        while (num4 != 0) {
            int digit = num4 % 10;
            if (digit % 2 == 0) {
                sum4 += digit;
            }
            num4 /= 10;
        }
        System.out.println("La suma de los dígitos pares es: " + sum4);

        //8
        int n3 = 10;
        while (n3 >= 1) {
            System.out.println(n3);
            n3--;
        }

        //9
        int num6 = 123456;
        int sum6 = 0;
        while (num6 != 0) {
            int digit = num6 % 10;
            if (digit % 2 != 0) {
                sum6 += digit;
            }
            num6 /= 10;
        }
        System.out.println("La suma de los dígitos impares es: " + sum6);
        //10
        String str = "Hola Mundo";
        int count6 = 0;
        int i6 = 0;
        while (i6 < str.length()) {
            char ch = str.toLowerCase().charAt(i6);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count6++;
            }
            i6++;
        }
        System.out.println("La cadena tiene " + count6 + " vocales.");

        //11
        int num11 = 28; // Número para verificar
        int sum11 = 0;
        int i11 = 1;

        while (i11 <= num11 / 2) {
            if (num11 % i11 == 0) {
                sum11 += i11;
            }
            i11++;
        }

        if (sum11 == num11) {
            System.out.println(num11 + " es un número perfecto.");
        } else {
            System.out.println(num11 + " no es un número perfecto.");
        }
