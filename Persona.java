public class Persona {
    private int id;
    private String nombre;
    private String sexo;

    public Persona(int id, String nombre, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Sexo: " + sexo;
    }
}
