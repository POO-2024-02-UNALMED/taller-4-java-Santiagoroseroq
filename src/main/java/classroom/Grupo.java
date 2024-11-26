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
        this.estudiantes = new Persona[cantidadEstudiantes];
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public void cambiarEstudiante(int posicion, Persona estudiante) {
        this.estudiantes[posicion] = estudiante;
    }

    public void cambiarEstudiante(Persona estudianteAnterior, Persona estudianteNuevo) {
        for (int i = 0; i < this.estudiantes.length; i++) {
            if (this.estudiantes[i] == estudianteAnterior) {
                this.estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
}