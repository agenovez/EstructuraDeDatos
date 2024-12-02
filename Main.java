import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Arreglo unidimensional de estudiantes
        String[] aula = {
            "1, Juan Perez, M, 8.5, 9.0, 7.5",
            "2, Maria Lopez, F, 6.0, 5.5, 6.0",
            "3, Pedro Gomez, M, 7.0, 8.0, 7.5",
            "4, Ana Torres, F, 4.0, 5.0, 6.0"
        };

        // Instancia de la clase Metodos
        Metodos metodos = new Metodos();

        // Convertir arreglo a lista enlazada
        LinkedList<Alumno> myAula = metodos.convertirArregloALista(aula);

        // Generar reportes
        metodos.generarReporte(myAula);
    }
}
