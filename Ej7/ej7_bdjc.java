
import java.util.Scanner;

public class ej7_bdjc {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int valor1 = (int) (Math.random() * 50+1);
        //int valor2 = (int) (Math.random() * 50+1);
        //int valor3 = (int) (Math.random() * 50+1);
        double iva = 0;
        //precio de 3 productos, cuando el valor sea entre 30 a 39
        //cobrar un iva de 2%. Precio sea mayor a 39 cobrar un 3% iva
        //iva = (valor1<30) ? valor1*0.01 : valor1*0.02;

        /*System.out.println("Precio 1 " + valor1);
        if(valor1>=30 && valor1<=39){
            iva = valor1 * 0.01;
        }
        else{
                iva = valor1 * 0.02;
        }
        */
        //iva = (valor1 < 30) ? 0 : ((valor1>=30 && valor1<=39) ? valor1 * 0.02 : valor1 * valor1 * 0.03);
        iva = (valor1 > 39) ? valor1 * 0.03 : ((valor1 > 29) ? valor1 * 0.02 : 0);

        System.out.println("Precio 1: " + valor1);
        System.out.println("Iva " + iva);
        System.out.println("Total " + (valor1+iva));

    }

}