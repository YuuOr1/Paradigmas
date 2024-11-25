import java.util.Scanner;

public class Ej3_BDJC {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        char [] iniciales = new char[8];
        String nombre, paterno, materno;


        //System.out.println("Nombre");
        //System.out.println("Otro nombre");
        do {
            System.out.println("Nombre:");
            nombre = leer.nextLine();
            if (nombre.length() == 0) {
                System.out.println("El nombre no puede quedar vacío.");
            } else if (noLetras(nombre)) {
                System.out.println("El nombre solo debe contener letras.");
            }
            else if(noNumeros(nombre)) {
                System.out.println("El apellido materno solo debe contener numeros.");
            }
        } while (nombre.length() == 0 || noLetras(nombre) || noNumeros(nombre));
        
        // Solicitar apellido paterno
        do {
            System.out.println("Apellido paterno:");
            paterno = leer.nextLine();
            if (paterno.length() == 0) {
                System.out.println("El apellido paterno no puede quedar vacío.");
            } else if (noLetras(paterno)) {
                System.out.println("El apellido paterno solo debe contener letras.");
            }
            else if(noNumeros(paterno)) {
                System.out.println("El apellido materno solo debe contener numeros.");
            }
        } while (paterno.length() == 0 || noLetras(paterno) || noNumeros(paterno));

        // Solicitar apellido materno
        do {
            System.out.println("Apellido materno:");
            materno = leer.nextLine();
            if (materno.length() == 0) {
                System.out.println("El apellido materno no puede quedar vacío.");
            } else if (noLetras(materno)) {
                System.out.println("El apellido materno solo debe contener letras.");
            }
            else if(noNumeros(materno)) {
                System.out.println("El apellido materno solo debe contener numeros.");
            }
        } while (materno.length() == 0 || noLetras(materno) || noNumeros(materno));
        
        iniciales[0] = paterno.toUpperCase().charAt(0);
        iniciales[1] = vocalPaterno(paterno);
        iniciales[2] = materno.toUpperCase().charAt(0);
        iniciales[3] = nombre.toUpperCase().charAt(0);

        System.out.println("Comprobando datos");
        System.out.println(nombre + " " + paterno + " " + materno);
        System.out.println("Iniciales: ");
        desplegarArreglo(iniciales);
    }
    public static void desplegarArreglo(char[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
public static boolean noNumeros(String cadena) {
        for(int index = 0; index < cadena.length(); index++){
            System.out.println(cadena.charAt(index));
            if(Character.isDigit(cadena.charAt(index)))
                System.out.println("No usar numeros");
                return false; //hay numeros, no se premite
        }
        return true;
    }

    public static boolean noLetras(String cadena) {
        for(int index = 0; index < cadena.length(); index++){
            System.out.println(cadena.charAt(index));
            if(!Character.isAlphabetic(cadena.charAt(index)))
                System.out.println("Solo letras");
                return false; //careacteres especiales, no se permite
        }
        return true;
    }
    public static char vocalPaterno(String cadena) {
        cadena = cadena.toUpperCase();
        String vocales = "AEIOU";
        for(int i = 1; i < cadena.length(); i++){
            if(vocales.indexOf(cadena.charAt(i)) != -1){
                return cadena.charAt(i);
            }
        }
        return ' ';
    }
    
}
