/* Algoritmo de Busqueda Binaria
* @ autor agenovez
*/

import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar el arreglo
        int[] vec = new int[6];

        // Llenar el arreglo
        System.out.println("Ingrese números del arreglo:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            vec[i] = scanner.nextInt();
        }

        // Solicitar el número a buscar
        System.out.println("\nDigite el número a buscar:");
        int num = scanner.nextInt();

        // Variables para búsqueda binaria
        int inf = 0; // Inicio del rango
        int sup = vec.length - 1; // Fin del rango
        int centro;
        boolean encontrado = false; // Bandera para determinar si se encuentra el número

        // Proceso de búsqueda binaria
        while (inf <= sup && !encontrado) {
            centro = (inf + sup) / 2; // Calcular el punto medio

            if (vec[centro] == num) {
                encontrado = true; // Número encontrado
                System.out.println("El número: " + num + " se encuentra en la posición: " + (centro + 1) + " (índice: " + centro + ").");
            } else if (vec[centro] < num) {
                inf = centro + 1; // Mover el inicio hacia la derecha
            } else {
                sup = centro - 1; // Mover el final hacia la izquierda
            }
        }

        // Si el número no fue encontrado
        if (!encontrado) {
            System.out.println("El número: " + num + " no está en el vector.");
        }

        scanner.close();
    }
}
