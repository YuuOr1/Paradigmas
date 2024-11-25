import java.util.Scanner;

public class ejercicio20
{

    public static void main(String[] args) {

        String letraJug1, letraJug2;

        letraJug1 = pedirLetra();
        letraJug2 = letraJug1.equals("X")?"O":"X";
        System.out.println("Jugador 1 tira " + letraJug1);
        System.out.println("Jugador 2 tira " + letraJug2);

    }

    public static String pedirLetra()
    {
        Scanner leer = new Scanner(System.in);
        String dato;
        do
        {
            System.out.println("Elige X o O");
            dato = leer.nextLine().toUpperCase();
        } while(!valida.soloXO(dato));
        return dato;

    }

}