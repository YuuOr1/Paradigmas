import java.util.Scanner;

public class Ej1_BDJC {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        char [] iniciales = new char[8];
        String nombre, paterno;
        float promedio;
        byte mm, aa, dd, edad;
        char materno;
        char Letra;
        int poblacion;
        boolean continuar;

        //System.out.println("Nombre");
        //System.out.println("Otro nombre");
        System.out.println("Nombre");
        leer.nextLine();

        System.out.println("Paterno");
        paterno = leer.nextLine();
        System.out.println("Materno");
        //Falta validar negativos
        materno = leer.nextLine().charAt(0)
        System.out.println("Fecha de nacimiento");

        do{
            System.out.println("Año (ultimos 2 digitos): ");
            aa = leer.nextByte();
        }while((aa<1 || aa>99) && (aa+"").length()<2);

        do{
            System.out.println("Mes: ");
            mm = leer.nextByte();
        }while(mm<1 || mm>12);

        do{
            System.out.println("Dia");
            dd = leer.nextByte();
        }while(dd<1 || dd>31);

        iniciales[0] = paterno.toUpperCase().charAt(0);
        iniciales[1] = '';
        //Que sucede cuando no hay materno?
        iniciales[2] = materno.toUpperCase().charAt(0);
        iniciales[3] = nombre.toUpperCase().charAt(0);
        iniciales[4] = (aa+"").charAt(0);
        iniciales[5] = (aa+"").charAt(0);
        if (mm<10){
            iniciales[6]= '0';
            iniciales[7]= (mm+"").charAt(1);
        }else{
            iniciales[6] = (mm+"").charAt(0);
            iniciales[7] = (mm+"").charAt(1);
        }
        if(dd<10){
            
        }

    }
    
}
