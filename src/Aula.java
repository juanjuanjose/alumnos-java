public class Aula {
    private String ID;
    private int capacidad;

    public Aula(String ID, int capacidad){
        this.ID = ID;
        this.capacidad = capacidad;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

}
