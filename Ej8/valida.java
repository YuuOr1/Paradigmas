public class valida {
    public static boolean strVacio(String elem){
        if(elem.length() == 0)
            return true;
        else
            return false;
    }

    public static boolean soloLetras(String cadena) {
        int ulti = cadena.length()-1;
        if(cadena.charAt(0) == ' ' || cadena.charAt(ulti) == ' '){
            System.out.println("Sin espacios al inicio y al final");
            return false;
        }

        for(int index = 0; index < cadena.length(); index++){
            //System.out.println(cadena.charAt(index));
            if(cadena.charAt(index) == ' '){

            }
            else{
                if(Character.isAlphabetic(cadena.charAt(index))== false){
                    System.out.println("Solo letras");
                    return false; //careacteres especiales, no se permite
                }
            }
        }
        return true;
    }

    public static boolean positivo(int numero){
        if(numero>0)
            return true;
        else
            return false;

    }
}
