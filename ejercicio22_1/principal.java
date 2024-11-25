import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona vendedor = new Persona();
        //Persona profesor = new Persona("Roberto" "Estadistica"); // error
        Persona profesor = new Persona("Roberto");
        Persona alumno  = new Persona("Arturo", 1.78f, true);
        Puesto secretaria = new Puesto(2000, "Asistente administrativa");
        //System.out.println(vendedor.toString());
        //System.out.println(profesor.toString());
        //System.out.println(alumno.toString());

        Empleado asistente1 = new Empleado(1,'V');
        asistente1.setNombre("Elizabeth");
        asistente1.setActivo(true);
        asistente1.setActividad(secretaria);
        System.out.println(asistente1.toString());


    }
}