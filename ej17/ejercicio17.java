import java.util.Scanner;

public class ejercicio17{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        short edad;
        System.out.println("Ejercicio 17");
        do { 
            edad = pedirValor("Edad", (short) 0, (short) 120);
        } while (mayorEdad(edad) == false);

        toString(edad);

    }

    private static boolean mayorEdad(int edad){
        if(edad > 17)
            return true;
        else return false;
    }

    public static short pedirEdad()
    {
        Scanner scanner = new Scanner(System.in);
        short edad = 0;
        String Dato = "";
        boolean valido = true;
        do
        {
        System.out.print("Edad: ");
        Dato = scanner.nextLine();

        for (int i = 0; i < Dato.length(); i++) 
            if(!Character.isDigit(Dato.charAt(i))) valido = false;

        if(valido) edad = Short.parseShort(Dato);
        }while(edad < 0 || edad > 120 || !valido);
        return edad;
    }

    public static short pedirValor(String msg, short min, short max)
    {
        Scanner scanner = new Scanner(System.in);
        short edad = 0;
        String Dato = "";
        boolean valor = true;
        do
        {
        System.out.print(msg + ": ");
        Dato = scanner.nextLine();

        for (int i = 0; i < Dato.length(); i++) 
            if(!Character.isDigit(Dato.charAt(i))) valor = false;

        if(valor) edad = Short.parseShort(Dato);
        }while(edad < min || edad > max || !valor);
        return edad;
    }

    public static void toString(short edad)
    {
        System.out.println("Datos Personales ");
        System.out.println("Edad: " + edad);
    }

}