public class Profesor {
    private String NRP;
    private String nombre;
    private String categoria;
    private String area;
    private Departamento departamento;


    public Profesor(String NRP, String nombre, String categoria, String area){
        this.NRP = NRP;
        this.nombre = nombre;
        this.categoria = categoria;
        this.area = area;
    }
    public String getNRP(){
        return NRP;
    }
    public void setNRP(){
        this.NRP = NRP;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String GetArea(){
        return area;
    }

    public void setArea(String area){
        this.area = area;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

}
