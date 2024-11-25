public class valida {
    public static boolean soloXO(String dato)
    {
        //Probar el metodo matches
        /*if(dato.equals("X") || dato.equals("O"))
            return true;
        else
            return false;*/
        
            return dato.matches("X") || dato.matches("O");

    }
}
