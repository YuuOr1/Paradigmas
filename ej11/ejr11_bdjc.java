import java.util.Scanner;

public class ejr11_bdjc{

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero = (int)(Math.random() * 50) + 1;

        System.out.println("Pares-----------------------------------------");
        for(int i =1; i <= numero; i++){
            if(i%2 == 0)
                System.out.println(i);
        }
        System.out.println("Impares----------------------------------------------");
        int i = 1;

        while(i <= numero){

            if(i%2 == 0){
                System.out.println(i+1);
            }

            i++;
        }

        System.out.println("Equivalente negativo-------------------------------------------");
        int n = -1;

        do{
            System.out.println(n);
            n--;  
        }while(n >= -numero);
    }
}