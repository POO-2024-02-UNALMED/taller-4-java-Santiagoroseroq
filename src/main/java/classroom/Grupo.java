package classroom;

public class Grupo {
    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo;
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void cambiarEstudiante(int indice, Persona estudiante) {
        this.estudiantes[indice] = estudiante;
    }

    public void cambiarEstudiante(Persona estudiante1, Persona estudiante2) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == estudiante1) {
                estudiantes[i] = estudiante2;
            }
        }
    }
}