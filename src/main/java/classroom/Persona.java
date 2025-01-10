package classroom;

public class Persona {
    public final long cedula;
    private String nombre;
    private static int totalPersonas;

    static {
        totalPersonas = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(String nombre, long cedula) {
        this(cedula, nombre);
    }

    public Persona(long cedula) {
        this(cedula, "");
    }

    public Persona() {
        this(0, "");
    }

    public Persona(String nombre) {
        this(0, nombre);
    }

    public long getCedula() {
        return cedula;
    }
    public long setCedula(){
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getTotalPersonas() {
        return totalPersonas;
    }
}