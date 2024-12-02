public class Alumno extends Persona {
    private double promedio;

    public Alumno(int id, String nombre, String sexo, double promedio) {
        super(id, nombre, sexo);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Promedio: " + promedio;
    }
}
