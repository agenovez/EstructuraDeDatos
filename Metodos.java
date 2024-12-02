import java.util.LinkedList;

public class Metodos {
    // Método para convertir el arreglo unidimensional en una lista enlazada
    public LinkedList<Alumno> convertirArregloALista(String[] aula) {
        LinkedList<Alumno> myAula = new LinkedList<>();

        for (String registro : aula) {
            String[] datos = registro.split(","); // Dividir por coma
            int id = Integer.parseInt(datos[0].trim());
            String nombre = datos[1].trim();
            String sexo = datos[2].trim();
            double cal1 = Double.parseDouble(datos[3].trim());
            double cal2 = Double.parseDouble(datos[4].trim());
            double cal3 = Double.parseDouble(datos[5].trim());
            double promedio = (cal1 + cal2 + cal3) / 3;

            Alumno alumno = new Alumno(id, nombre, sexo, promedio);
            myAula.add(alumno);
        }

        return myAula;
    }

    // Método para generar reportes de aprobación o reprobación
    public void generarReporte(LinkedList<Alumno> myAula) {
        System.out.println("Reporte de Aprobación:");
        for (Alumno alumno : myAula) {
            if (alumno.getPromedio() >= 7) {
                System.out.println(alumno);
            }
        }

        System.out.println("\nReporte de Reprobación:");
        for (Alumno alumno : myAula) {
            if (alumno.getPromedio() < 7) {
                System.out.println(alumno);
            }
        }
    }
}
