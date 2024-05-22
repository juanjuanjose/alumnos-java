import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("12345678A","Juan","Calle 127", true);
        Alumno alumno2 = new Alumno("78314789B","Maria","Avenidad 140",false);

        Asignatura asignatura = new Asignatura("ASG001","Matematicas",6,"Obligatoria",1);

        Grupo grupo = new Grupo("GRP001","Teoria");
        grupo.setAsignatura(asignatura);

        ArrayList<Grupo> gruposAsignatura = new ArrayList<>();
        gruposAsignatura.add(grupo);
        asignatura.setGrupos(gruposAsignatura);

        Profesor profesor = new Profesor("P001","DR","Lopez","Titular");
        ArrayList<Profesor> profesoresGrupo = new ArrayList<>();
        profesoresGrupo.add(profesor);
        grupo.setProfesores(profesoresGrupo);

        Aula aula = new Aula ("1001",30);
                grupo.setAula(aula);

        Horario horario1 = new Horario("Lunes","9:00 am - 1:00 pm");
        Horario horario2 = new Horario("miercoles","8:00 am - 2:00 pm");
        ArrayList<Horario> horarios = new ArrayList<>();
        horarios.add(horario1);
        horarios.add(horario2);
        grupo.setHorarios(horarios);

        Matricula matricula1 = new Matricula(alumno1, grupo, 0.0);
        Matricula matricula2 = new Matricula(alumno2, grupo,0.0);
                ArrayList<Matricula> matriculas = new ArrayList<>();
        matriculas.add(matricula1);
        matriculas.add(matricula2);
        alumno1.setMatriculas(matriculas);
        alumno2.setMatriculas(matriculas);
        grupo.setMatriculas(matriculas);

        System.out.println("Asignatura"+ asignatura.getNombre());
        System.out.println("Grupo"+ grupo.getTipo());
        System.out.println("Profesor" + profesor.getNombre());
        System.out.println("Aula"+ aula.getID() + ", Capacidad: " + aula.getCapacidad());
        System.out.println("Horario");
        for(Horario horario : horarios){
            System.out.println(" " + horario.getDia() + ":" + horario.getHora());
        }
        System.out.println("Alumnos matriculados:");
        for(Matricula matricula : matriculas){
            System.out.println(" " + matricula.getAlumno() .getNombre() + ", Calificacion: " + matricula.getCalificacion());

        }




    }
}