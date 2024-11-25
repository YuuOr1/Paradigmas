import java.util.Scanner;

public class ejr9_bdjc{
    public static void main(String[] args) 
    {
        
        System.out.println("REPASO EJERCICIO 9");
        Scanner leer = new Scanner(System.in);
        int dd,mm,aa;
        String mes;

        System.out.println("Fecha de nacimiento: ");
        System.out.print("Dia: ");
        dd = Integer.parseInt(leer.nextLine());

        do{
            System.out.print("Mes: ");
            mm = leer.nextInt();
        }while(mm < 1 || mm > 12);
        
        System.out.print("Año: ");
        aa = leer.nextInt();
        System.out.println("Naciste el " + NombreDia(dd) + " de " + NombreMes(mm) + " del " + Nombre(aa));

    }

    public static String NombreMes(int mm)
    {
        String mes = "";
        switch (mm) 
        {
            case 1 -> mes = "Enero";
            case 2 -> mes = "Febrero";
            case 3 -> mes = "Marzo";
            case 4 -> mes = "Abril";
            case 5 -> mes = "Mayo";
            case 6 -> mes = "Junio";
            case 7 -> mes = "Julio";
            case 8 -> mes = "Agosto";
            case 9 -> mes = "Septiembre";
            case 10 -> mes = "Octubre";
            case 11 -> mes = "Noviembre";
            case 12 -> mes = "Diciembre";
        }
        return mes;
    }

    public static String NombreDia(int numero)
    {
        String dia = "";
        int decenas = numero / 10;
        int unidades = numero % 10;

        if(numero >= 10 && numero <= 15)
        {
            switch (numero) 
            {

                case 11 -> dia = "once";
                case 12 -> dia = "doce";
                case 13 -> dia = "trece";
                case 14 -> dia = "catorce";
                case 15 -> dia = "quince";
            }
        }
        else
        {
            switch (decenas) 
            {
                case 1 -> dia = "Dieci";
                case 2 -> dia = "Veinti";
            }

        switch (unidades)
            {
                case 1 -> dia += "Uno";
                case 2 -> dia += "Dos";
                case 3 -> dia += "Tres";
                case 4 -> dia += "Cuatro";
                case 5 -> dia += "Cinco";
                case 6 -> dia += "Seis";
                case 7 -> dia += "Siete";
                case 8 -> dia += "Ocho";
                case 9 -> dia += "Nueve";
                
            }
        }  
        return dia;
    }

    public static String Nombre(int numero) {
        String year = "";
        int millares = numero / 1000;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10; 
    
        if (numero >= 1000 && numero <= 2999) {
            switch (millares) {
                case 1 -> year += "Mil ";
                case 2 -> year += "Dos mil ";
            }
    
            if (numero % 100 == 0) {
                return year;
            }
    
            if (numero % 100 >= 11 && numero % 100 <= 15) {
                switch (numero % 100) {
                    case 11 -> year += "Once";
                    case 12 -> year += "Doce";
                    case 13 -> year += "Trece";
                    case 14 -> year += "Catorce";
                    case 15 -> year += "Quince";
                }
                return year;
            }
    
            switch (decenas) {
                case 1 ->  year += "Dieci";
                case 2 ->  year += "Veinti";
                case 3 ->  year += "Treinta y ";
                case 4 ->  year += "Cuarenta y ";
                case 5 ->  year += "Cincuenta y ";
                case 6 ->  year += "Sesenta y ";
                case 7 ->  year += "Setenta y ";
                case 8 ->  year += "Ochenta y ";
                case 9 ->  year += "Noventa y ";
            }
    
            switch (unidades) {
                case 1 ->  year += "uno";
                case 2 ->  year += "dos";
                case 3 ->  year += "tres";
                case 4 ->  year += "cuatro";
                case 5 ->  year += "cinco";
                case 6 ->  year += "seis";
                case 7 ->  year += "siete";
                case 8 ->  year += "ocho";
                case 9 ->  year += "nueve";
            }
        }
    
        return year;
        
    }
}