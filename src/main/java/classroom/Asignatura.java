package classroom;

// Asignatura.java
public class Asignatura {
    public String nombre;
    public int codigoExterno;
    public int codigoInterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre", 0, Tipo.FUNDAMENTACION);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, tipo);
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this("Sin nombre", codigoExterno, tipo);
    }

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
    }

    public Asignatura(String nombre, int codigoExterno, Tipo tipo) {
        this(nombre, codigoExterno, 0, tipo);
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void