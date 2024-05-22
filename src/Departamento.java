import java.util.List;

public class Departamento {
    private String ID;
    private String nombre;
    public Profesor profesor;
    public List<Profesor> profesores;

    public Departamento(String ID, String nombre){
        this.ID = ID;
        this.nombre = nombre;
    }
    public String getID(){
        return ID;
    }

    public void setId(String ID){
        this.ID = ID;
    }

    public String getNombre(){
        return nombre;
    }

    public Profesor getProfesor(){
        return profesor;
    }

    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }

    public List<Profesor> getProfesores(){
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores){
        this.profesores = profesores;
    }
}
