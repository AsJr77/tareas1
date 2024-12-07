public class Ejercicio1 {
    public static void main(String[] args) {
        // Pruebas con diferentes valores de Celsius
        System.out.println("25°C -> " + celsiusAFahrenheit(25) + "°F");
        System.out.println("0°C -> " + celsiusAFahrenheit(0) + "°F");
        System.out.println("-10°C -> " + celsiusAFahrenheit(-10) + "°F");
    }

    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
}
