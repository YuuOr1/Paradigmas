import java.util.Scanner;

public class principal{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola Mundo.");
        int edad;
        String siglas, pais, nacionalidad;
        String CP;
        String dato;
        boolean correcto = false;
        float[] costo = {33, 250, 73, 60};
        float  dolares;

        do { 
            System.out.println("Edad: ");
            edad = leer.nextInt();
            leer.nextLine();//Recuperar el enter del buffer del teclado
        } while (edad < 0 || edad > 120);

        if(edad < 18)
            System.out.println("Es menor de edad.");
        else
            if(edad >= 18 && edad <= 30)
                System.out.println("Adulto joven.");
                else
                    if(edad > 30 && edad <60)
                        System.out.println("Adulto maduro.");
                        else
                            System.out.println("Tercera edad");
        //preguntar nacionalidad
        do { 
            System.out.println("Nacionalidad MEX-Mexicano USA-Estadounidense CHI-Chino KR-Koreano");
            siglas = leer.nextLine().toUpperCase();
        } while (siglas.length() == 0 || siglas.length() > 3);

        System.out.println("Calcularemos para cuantas visas te alcanzan.");
        System.out.println("Cuantos dolares tienes? ");
        dolares = Float.parseFloat(leer.nextLine());

        
        switch (siglas) {
            case "MEX":
                pais = "Mexico";
                break;
            case "USA":
                pais = "Estados Unidos";
                break;
            case "CHI":
                pais = "China";
                break;
            case "KR":
                pais = "Koreano";
                break;
            default:
                System.out.println("Pais no valido.");
        }

        //Calculo de visas
        //0-MEX 1-USA 2-CHI 3-KR
        /*if(siglas.equals("MEX")){
            System.out.println("Es mexicano.");
            if(dolares >= costo[1]){
                System.out.println("Visa de Estados Unidos");
                dolares = dolares - costo[1];
            }
            if(dolares >= costo[2]){
                System.out.println("Visa de China");
                dolares = dolares - costo[2];
            }
            if(dolares >= costo[3]){
                System.out.println("Visa de Korea");
                dolares = dolares - costo[3];
            }
        }*/

        if(siglas.equals("MEX")){
            System.out.println("Es Mexicano");
            for(int i = 1; i<= 3; i++){
                if(dolares >= costo[i]){
                    System.out.println("Visa de" + i);
                    dolares = dolares - costo[i];
                }
            }
        }

        else if(siglas.equals("USA")){
            System.out.println("Es Estado Unidense");
            for(int i = 1; i<= 3; i++){
                if(dolares >= costo[i]){
                    System.out.println("Visa de " + i);
                    dolares = dolares - costo[i];
                }
            }
        }

        else if(siglas.equals("CHI")){
            System.out.println("Es Asiatico");
            for(int i = 1; i<= 3; i++){
                if(dolares >= costo[i]){
                    System.out.println("Visa de " + i);
                    dolares = dolares - costo[i];
                }
            }
        }

        else if(siglas.equals("KR")){
            System.out.println("Es Asiatico");
            for(int i = 1; i<= 3; i++){
                if(dolares >= costo[i]){
                    System.out.println("Visa de " + i);
                    dolares = dolares - costo[i];
                }
            }
        }

        /*do { 
            System.out.println("Edad: ");
            dato = leer.nextLine();
            for(int i = 0; i < dato.length(); i++){
                if(dato.charAt(i) == '0' || dato.charAt(i) == '1' || dato.charAt(i) == '9'){
                    correcto = true;
                }
                else{
                    correcto = false;
                }
            }
        } while ();*/

    }

}