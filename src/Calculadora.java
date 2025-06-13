import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUno = 0;
        int numeroDos = 0;
        int opcion = 0;

        System.out.println("Hola y bienvenido/a!" + "\n");
        System.out.println("Por favor, indica qué operación matemática necesitas hacer:" + "\n");
        System.out.println("Indica 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir o 5 para módulo: ");

        opcion = teclado.nextInt();

        System.out.println("Ingresa el primer número:");
        numeroUno = teclado.nextInt();
        System.out.println("Ingresa el segundo número:");
        numeroDos = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("El resultado de la SUMA es = " + (numeroUno + numeroDos));
        }
        if (opcion == 2) {
            System.out.println("El resultado de la RESTA es = " + (numeroUno - numeroDos));
        }
        if (opcion == 3) {
            System.out.println("El resultado de la MULTIPLICACIÓN es = " + (numeroUno * numeroDos));
        }
        if (opcion == 4) {
            System.out.println("El resultado de la DIVISIÓN es = " + (numeroUno / numeroDos));
        }
        if (opcion == 5) {
            System.out.println("El resultado del MÓDULO es = " + (numeroUno % numeroDos));
        }

    }

}
