package classroom;

public class Grupo {
    private Persona[] estudiantes;
    private Persona profesor;
    private Asignatura asignatura;
    private int codigo;
    private String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = new Persona[cantidadEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public Persona[] getEstudiantes() {
        return estudiantes;
    }

    public void cambiarEstudiante(int posicion, Persona estudiante) {
        this.estudiantes[posicion] = estudiante;
    }

    public void cambiarEstudiante(Persona estudianteActual, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == estudianteActual) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
}