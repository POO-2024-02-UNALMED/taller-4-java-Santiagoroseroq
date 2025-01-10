package classroom;

public enum Tipo {
    DISCIPLINAR(10, "Disciplinar"),
    FUNDAMENTACION(20, "Fundamentación"),
    ELECTIVA(30, "Electiva");

    private int codigo;
    private String nombre;

    Tipo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}