import java.util.Scanner;

public class ExamenP1{   

   public static void main(String[] args) {
        System.out.println("-----------------------------------------------------Ejercicio 1");

        ejercicio1();

        System.out.println("-----------------------------------------------------Ejercicio 2");

        ejercicio2();

    }

    public static void ejercicio1(){

        String ast = "*";

        for(int i = 0; i < 6; i++){

            System.out.println(ast);
            ast = ast + "*";
        }

        System.out.println("");

    }

    public static void ejercicio2(){
        Scanner dato = new Scanner(System.in);
        int dd, mm;

        System.out.println("Introduzca si dia de nacimiento: ");
        dd = dato.nextInt();

        System.out.println("Ingrese su mes de nacimiento: ");
        mm = dato.nextInt();

        switch (dd) {
            case 1:
                System.out.println("Uno ");
                
                break;
            case 2:
                System.out.println("Dos ");
            
            break;
            case 3:
                System.out.println("Tres ");
            
            break;
            case 4:
                System.out.println("Cuatro ");
            
            break;
            case 5:
                System.out.println("Cinco ");
            
            break;
            case 6:
                System.out.println("Seis ");
            
            break;
            case 7:
                System.out.println("Siete ");
            
            break;
            case 8:
                System.out.println("Ocho ");
            
            break;
            case 9:
                System.out.println("Nueve ");
            
            break;
            case 10:
                System.out.println("Diez ");
            
            break;
            case 11:
                System.out.println("Once ");
            
            break;
            case 12:
                System.out.println("Doce ");
            
            break;
            case 13:
                System.out.println("Trece ");
            
            break;
            case 14:
                System.out.println("Catorce ");
            
            break;
            case 15:
                System.out.println("Quince ");
            
            break;
            case 16:
                System.out.println("Dieciseis ");
            
            break;
            case 17:
                System.out.println("Diecisiete ");
            
            break;
            case 18:
                System.out.println("Diesiocho ");
            
            break;
            case 19:
                System.out.println("Diecinueve ");
            
            break;
            case 20:
                System.out.println("Veinte ");
            
            break;
            case 21:
                System.out.println("Veintiuno ");
            
            break;
            case 22:
                System.out.println("Veintidos ");
            
            break;
            case 23:
                System.out.println("Veintitres ");
            
            break;
            case 24:
                System.out.println("Veinticuatro ");
            
            break;
            case 25:
                System.out.println("Veinticinco ");
            
            break;
            case 26:
                System.out.println("Veintiseis ");
            
            break;
            case 27:
                System.out.println("Veintisiete ");
            
            break;
            case 28:
                System.out.println("Veintiocho ");
            
            break;
            case 29:
                System.out.println("Veintinueve ");
            
            break;

            case 30:
                System.out.println("Treinta ");
            
            break;
            case 31:
                System.out.println("Trentaiuno ");
            
            break;
            default:
                System.out.println("Valor incorrecto");
        }

        switch (mm) {
            case 1:
                System.out.println("de Enero ");
                
                break;
            case 2:
                System.out.println("de Febrero ");
            
            break;
            case 3:
                System.out.println("de Marzo ");
            
            break;
            case 4:
                System.out.println("de Abril ");
            
            break;
            case 5:
                System.out.println("de Mayo ");
            
            break;
            case 6:
                System.out.println("de Junio ");
            
            break;
            case 7:
                System.out.println("de Julio ");
            
            break;
            case 8:
                System.out.println("de Agosto ");
            
            break;
            case 9:
                System.out.println("de Septiembre ");
            
            break;
            case 10:
                System.out.println("de Octubre ");
            
            break;
            case 11:
                System.out.println("de Noviembre ");
            
            break;
            case 12:
                System.out.println("de Diciembre ");
            default:
                System.out.println("Dato invalido");
        }

    }


}