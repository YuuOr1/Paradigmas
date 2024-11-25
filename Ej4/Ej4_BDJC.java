
import java.util.Scanner;

public class Ej4_BDJC {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dinero;
        int opcion = 0;

        System.out.println("Cuanto tienes: ");
        dinero = Integer.parseInt(leer.nextLine());
        System.out.println("Tu saldo el $" + dinero);


        //do{
        while(dinero > 0 && opcion != 9){
            menu();
            System.out.println("Que desea?");
            opcion = Integer.parseInt(leer.nextLine());
            //Descontar el dinero del producto
            switch(opcion){
                case 1:
                    if(dinero >= 10){
                        dinero -= 10;
                        System.out.println("Has comprado Mazapan. Tu saldo ahora es $" + dinero);
                    }else{
                        System.out.println("No tienes suficiente dinero");
                    }
                    break;
                case 2:
                    if(dinero >= 15){
                        dinero -= 15;
                        System.out.println("Has comprado Chocolate. Tu saldo ahora es $" + dinero);
                    }else{
                        System.out.println("No tienes suficiente dinero");
                    }
                    break;
                case 3:
                    if(dinero >= 20){
                        dinero -= 20;
                        System.out.println("Has comprado Gomitas. Tu saldo es $" + dinero);
                    }else{
                        System.out.println("No tienes suficiente dinero");
                    }
                    break;
                default:
                    System.out.println("Lo siento no tenemos ese producto.");
                    break;
            }
        }//while(opcion != 9 && dinero >0);
        System.out.println("Saldo final " + dinero);

    }

    public static void menu(){
        System.out.println("Menu de dulces");
        System.out.println("1. Mazapan $10");
        System.out.println("2. Chocolate $15");
        System.out.println("3. Gomitas $20");
        System.out.println("9. Salir");

    }

}