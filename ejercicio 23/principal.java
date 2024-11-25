import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

package ejercicio23{
public class principal{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        /*Persona vendedor = new Persona();
        //Persona profesor = new Persona("Roberto" "Estadistica"); // error
        Persona profesor = new Persona("Roberto");
        Persona alumno  = new Persona("Arturo", 1.78f, true);
        Puesto secretaria = new Puesto(2000, "Asistente administrativa");
        Puesto chofer = new Puesto(3000, "Conductor");
        //System.out.println(vendedor.toString());
        //System.out.println(profesor.toString());
        //System.out.println(alumno.toString());

        Empleado asistente1 = new Empleado(1,'V');
        asistente1.setNombre("Elizabeth");
        asistente1.setActivo(true);
        asistente1.setActividad(secretaria);
        System.out.println(asistente1.toString());

        System.out.println("Lista de puestos");
        System.out.println(secretaria.toString());
        System.out.println(chofer.toString());*/
        String archivo = "C:\\Users\\joseb\\OneDrive\\Documentos\\UABC\\Semestre 4\\Paradigmas\\ejercicio 23\\puestos.txt";
        ArrayList<Puesto> puestos = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        leerArchivo(archivo, puestos);
        float estatura;
        Empleado auxEmp = new Empleado();
        int salario, id, ult, antiguedad, num;
        String nombre;
        Puesto aux;
        char turno;

        int opcion;
        do{
            menu();
            opcion = leer.nextInt();
            leer.nextLine(); // Consumir la linea despues del nexInt()
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del puesto: ");
                    nombre = leer.nextLine();
                    System.out.println("Salario semanal: ");
                    salario = Integer.parseInt(leer.nextLine());
                    ult = puestos.size();
                    id = puestos.get(ult-1).getNum() + 1;
                    aux = new Puesto(id, salario, nombre);
                    puestos.add(aux);
                    break;
                case 2: 
                    for(Puesto puesto : puestos){
                        System.out.println(puesto);
                    }
                    break;
                case 3:
                    guardarArchivo(archivo, puestos);
                    break;
                case 4:
                    System.out.println("Nombre: ");
                    nombre = leer.nextLine();
                    System.out.println("Estatura: ");
                    estatura = Float.parseFloat(leer.nextLine());
                    System.out.println("Antiguedad :");
                    antiguedad = Integer.parseInt(leer.nextLine());
                    System.out.println("Truno M/V/N:");
                    turno = leer.nextLine().charAt(0);
                    for (Puesto puesto : puestos){
                        System.out.println(puesto);
                    }
                    System.out.println("Num Puesto: ");
                    num = Integer.parseInt(leer.nextLine());
                    auxEmp.setNombre(nombre);
                    auxEmp.setEstatura(estatura);
                    auxEmp.setActivo(true);
                    auxEmp.setTurno(turno);
                    auxEmp.settiempo(antiguedad);
                    auxEmp.setActividad(null);
                    empleados.add(auxEmp);
                    //Sacar del arraylist de puestos el num que tecleo
                    //auxEmp.setActividad(pendiente);
                    break;
                case 5:
                    for(Empleado empleado : empleados){
                        System.out.println(empleado);
                    }
                    break;
                default:
                    break;
            }
        }while (opcion != 9);

        }

    public static void menu(){
        System.out.println("Ejercicio 23 Empleados con objetos");
        System.out.println("1. Insertar puestos");
        System.out.println("2. Mostrar puestos");
        System.out.println("3. Guardar puestos");
        System.out.println("4. Insertar Empleados");
        System.out.println("5. Mostrar Empleados");
        System.out.println("6. Dar de baja empleado");
        System.out.println("7. Guardar empleados");
        System.out.println("9. Salir");
    }

    public static void guardarArchivo(String archivo, ArrayList<Puesto> array) throws Exception{
        File file = new File(archivo);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (Puesto puesto : array){
            writer.write(puesto.getNum() + "," + puesto.getNombre() + puesto.getSalario() + "\n");
        } writer.close();
    }

    public static void leerArchivo(String archivo, ArrayList<Puesto> array) throws Exception{
        //String archivo = "C:\\Users\\joseb\\OneDrive\\Documentos\\UABC\\Semestre 4\\Paradigmas\\ejercicio 23\\puestos.txt";
        InputStream ins = new FileInputStream(archivo);
        Scanner obj = new Scanner(ins);
        while (obj.hasNextLine()) {
            String linea = obj.nextLine();
            String[] parts = linea.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];
            System.out.println(part1 + " " + part2 + " " + part3);
            Puesto aux = new Puesto(Integer.parseInt(part1), Integer.parseInt(part3), part2);
            array.add(aux);
        }
    }
}
}
