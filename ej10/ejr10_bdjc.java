import java.util.Scanner;

public class ejr10_bdjc{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //serie fibonacci 0, 1, 1, 2, 3

        int entero1 = 0;
        int entero2 = 1;
        int aux = 0;

        System.out.println("-----------------------Con For--------------------------------");

        System.out.println(entero1);
        System.out.println(entero2);

        for(int i = 0; i < 10; i++){
            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;

            System.out.println(aux);
        }

        System.out.println("-----------------------Con while--------------------------------");
        entero1 = 0;
        entero2 = 1;
        aux = 0;
        int i = 1;

        System.out.println(entero1);
        System.out.println(entero2);

        while(i < 11){
            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;
            i ++;
            System.out.println(aux);
        }

        System.out.println("-----------------------Con Do-While--------------------------------");
        entero1 = 0;
        entero2 = 1;
        aux = 0;
        i = 1;

        System.out.println(entero1);
        System.out.println(entero2);

        do{
            aux = entero1 + entero2;
            entero1 = entero2;
            entero2 = aux;
            i ++;
            System.out.println(aux);
        }while(i < 11);


    }

}