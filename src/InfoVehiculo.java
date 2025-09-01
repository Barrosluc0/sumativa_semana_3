// InfoVehiculo.java
import java.util.Scanner; // importa la clase Scanner para leer desde teclado

public class InfoVehiculo { // define la clase principal del programa
    public static void main(String[] args) { // punto de entrada del programa
        Scanner sc = new Scanner(System.in); // crea un Scanner que lee desde System.in (teclado)

        String marca; // declara una variable de texto para la marca
        String modelo; // declara una variable de texto para el modelo
        int cilindrada; // declara una variable entera para la cilindrada (cc)
        String tipoCombustible; // declara una variable de texto para el combustible
        int capacidadPasajeros; // declara una variable entera para la capacidad

        System.out.print("Ingrese la marca: "); // pide la marca al usuario
        marca = sc.nextLine(); // lee la línea escrita para la marca

        System.out.print("Ingrese el modelo: "); // pide el modelo al usuario
        modelo = sc.nextLine(); // lee la línea escrita para el modelo

        System.out.print("Ingrese la cilindrada (solo numeros, en cc): "); // pide la cilindrada
        cilindrada = Integer.parseInt(sc.nextLine()); // convierte lo leído a entero y lo guarda

        System.out.print("Ingrese el tipo de combustible: "); // pide el tipo de combustible
        tipoCombustible = sc.nextLine(); // lee la línea con el tipo de combustible

        System.out.print("Ingrese la capacidad en pasajeros (solo numeros): "); // pide la capacidad
        capacidadPasajeros = Integer.parseInt(sc.nextLine()); // convierte lo leído a entero y lo guarda

        System.out.println(); // imprime una línea en blanco para separar
        System.out.println("La marca que ha ingresado es: " + marca); // muestra la marca ingresada
        System.out.println("El modelo que ha ingresado es: " + modelo); // muestra el modelo
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc"); // muestra la cilindrada
        System.out.println("El tipo de combustible es: " + tipoCombustible); // muestra el combustible
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros."); // muestra la capacidad

        sc.close(); // cierra el Scanner para liberar el recurso
    }
}
