package classroom;

public class Asignatura {
    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", 0, 0, Tipo.FUNDAMENTACION);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo);
    }

    public Asignatura(int codigoInterno, Tipo tipo) {
        this("Sin nombre", codigoInterno, 0, tipo);
    }

    public Asignatura(int codigoExterno, Tipo tipo, boolean esCodigoExterno) {
        this("Sin nombre", 0, codigoExterno, tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public int getCodigoExterno() {
        return codigoExterno;
    }

    public Tipo getTipo() {
        return tipo;
    }
}