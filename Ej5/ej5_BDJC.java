import java.util.Scanner;
//Este es el ejercicio 5 y 6
public class ej5_BDJC{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor = 6;//Cualquier numero
        int numero = 0;
        int oport = 3;
        boolean acerto = true;

        do{
            System.out.println("Escribe un numero entre 1 y 50 ");
            numero = Integer.parseInt(leer.nextLine());
            if(numero == valor) 
                acerto = true;
            else   
                if(numero<valor) 
                    System.out.println("Te falto");
                else //es mayor
                        System.out.println("Te pasaste");
            oport--;
        }while(!acerto && oport>0);

        if(!acerto)//no le atino
            System.out.println("El numero para adivinar era " + valor);

    }
}