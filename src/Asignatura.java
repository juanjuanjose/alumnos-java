import java.util.List;

public class Asignatura {
    private String ID;
    private String nombre;
    private int credito;
    private String caracter;
    private int curso;
    private List<Grupo> grupos;

    public Asignatura(String ID, String nombre, int credito, String caracteristicas, int curso){
        this.ID = ID;
        this.nombre = nombre;
        this.credito = credito;
        this.caracter = caracteristicas;
        this.curso = curso;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCredito(){
        return credito;
    }

    public void setCredito(int credito){
        this.credito = credito;
    }

    public String getCaracter(){
        return caracter;
    }

    public void setCarater(String caracter){
        this.caracter = caracter;
    }

    public int getCurso(){
        return curso;
    }

    public void setCurso(int curso){
        this.curso = curso;
    }
    public List<Grupo> getGrupos(){
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos){
        this.grupos = grupos;
    }

}
