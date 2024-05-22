import java.util.List;

public class Alumno {
    private String DNI;
    private String nombre;
    private String direccion;
    private boolean beca;
    private List<Matricula> matriculas;

    public Alumno(String DNI, String nombre, String direccion, boolean veca){
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.beca = veca;
    }
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public boolean isBeca(){
        return beca;
    }
    public void setBeca(boolean beca){
        this.beca = beca;
    }

    public List<Matricula> getMatriculas(){
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas){
        this.matriculas = matriculas;
    }


}
