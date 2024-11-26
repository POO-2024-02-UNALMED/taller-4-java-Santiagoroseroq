package classroom;

public class Asignatura {
    private String nombre;
    private int codigoExterno;
    private int codigoInterno;
    private Tipo tipo;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoExterno = 0;
        this.codigoInterno = 0;
        this.tipo = Tipo.FUNDAMENTACION;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = 0;
        this.codigoInterno = 0;
        this.tipo = tipo;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.codigoExterno = codigoExterno;
        this.codigoInterno = 0;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}