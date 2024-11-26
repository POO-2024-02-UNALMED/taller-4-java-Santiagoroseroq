package classroom;

public enum Tipo {
    DISCIPLINAR(10), FUNDAMENTACION(20), ELECTIVA(30);

    private int codigo;

    private Tipo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "codigo=" + codigo +
                ", nombre=" + name() +
                '}';
    }
}