import java.util.Scanner;

public class Ej2_BDJC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[ ] a = new int[10];
        int valor,pos,continuar;
        System.out.println("Ejercicio 2 Jose Becerra");
        do{
            //Pedir datos
            System.out.println("Que valor quiere guardar? ");
            valor = leer.nextInt();
            System.out.println("En que posicion? ");
            pos = leer.nextInt();
            //Validar
            if (a[pos] == 0)
            {
                a[pos] = valor;
                pos++;
            } 
            else
                System.out.println("Posicion ocupada");
                System.out.println("Continuar 1/0");
                continuar = leer.nextInt();
	    }while(continuar == 1);
        for(int i=0; i<=9; i++)
        System.out.println(i + " = " + a[i]);
    }
}