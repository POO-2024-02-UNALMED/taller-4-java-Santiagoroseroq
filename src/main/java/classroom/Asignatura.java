package classroom;

// Asignatura.java
public class Asignatura {
    public String nombre;
    public Tipo tipo;
    public int codigoExterno;
    public int codigoInterno;

    public Asignatura() {
        this.nombre = "Sin nombre";
        this.tipo = Tipo.FUNDAMENTACION;
        this.codigoExterno = 0;
        this.codigoInterno = 0;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = 0;
        this.codigoInterno = 0;
    }

    public Asignatura(int codigoExterno, Tipo tipo) {
        this.nombre = "Sin nombre";
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = 0;
    }

    public Asignatura(String nombre, int codigoExterno, int codigoInterno, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
}