package domain;

import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer nroLegajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer nroLegajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroLegajo = nroLegajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aprobo(Materia materia){
        return materiasAprobadas.contains(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(Integer nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
