import java.util.List;

public class Grupo {
    private String ID;
    private String tipo;
    private Asignatura asignatura;
    private List<Profesor> profesores;
    private List<Horario> horarios;
    private Aula aula;
    private List<Matricula> matriculas;

    public Grupo(String ID, String tipo){
        this.ID = ID;
        this.tipo = tipo;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Asignatura getAsignatura(){
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }

    public List<Profesor> getProfesores(){
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores){
        this.profesores = profesores;
    }

    public List<Horario> getHorarios(){
        return horarios;
    }

    public void setHorarios(List<Horario> horarios){
        this.horarios = horarios;
    }

    public Aula getAula(){
        return aula;
    }

    public void setAula(Aula aula){
        this.aula = aula;
    }

    public List<Matricula> getMatriculas(){
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas){
        this.matriculas = matriculas;
    }

}
