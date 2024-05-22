public class Matricula {
    private Alumno alumno;
    private Grupo grupo;
    private double calificacion;

    public Matricula(Alumno alumno, Grupo grupo, double calificacion){
        this.alumno = alumno;
        this.grupo = grupo;
        this.calificacion = calificacion;

    }

    public Alumno getAlumno(){
        return alumno;
    }

    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }

    public Grupo getGrupo(){
        return grupo;
    }

    public void setGrupo(Grupo grupo){
        this.grupo = grupo;
    }
    public double getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(double calificacion){
        this.calificacion = calificacion;
    }
}
