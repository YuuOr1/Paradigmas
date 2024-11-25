import java.util.Scanner;

public class ej8_bdjc {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        metodos.saludo();
        metodos.adios();
        boolean correcto = false;
        
        do{
            System.out.println("Nombre: ");
            nombre = leer.nextLine();
            correcto = valida.strVacio(nombre);
        }while(correcto == true || !valida.soloLetras(nombre));

        do { 
            System.out.println("Edad: ");
            edad = Integer.parseInt(leer.nextLine());
        } while (valida.positivo(edad) == false);

        System.out.println("tamaño del nombre: " + nombre.length());
        //Tarea hacer la edad de un rango aceptable, no admitir sin rellenar, ni letras
        
    }
}