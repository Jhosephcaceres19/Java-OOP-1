import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un nombre por teclado");

        String nombre = lector.nextLine();

        System.out.println("el nombre ingresado por teclado es: "+ nombre);
    }
}