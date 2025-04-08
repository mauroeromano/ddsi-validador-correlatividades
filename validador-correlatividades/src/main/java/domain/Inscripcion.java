package domain;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        return materias.stream()
                .allMatch(m -> m.getCorrelativas().stream()
                .allMatch(c -> alumno.aprobo(c)));
    }

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

}
