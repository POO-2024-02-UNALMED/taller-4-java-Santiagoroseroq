package classroom;


public class Persona {
    public String nombre;
    public int cedula;

    public Persona() {
        this("", 0);
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }

    public Persona(int cedula) {
        this("", cedula);
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona(int cedula, String nombre) {
        this(nombre, cedula);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }
}