class t2_BDJC {

    public static void metodoEstatico() {
        System.out.println("Este es un método estático.");
    }

    public void metodoNoEstatico() {
        System.out.println("Este es un método no estático.");
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    public boolean esMayorQue(int a, int b) {
        return a > b;
    }

    private void metodoPrivado() {
        System.out.println("Este es un método privado.");
    }

    protected void metodoProtegido() {
        System.out.println("Este es un método protegido.");
    }

    public static void main(String[] args) {
        //Metodo estático
        t2_BDJC.metodoEstatico();
        
        //Metodo no estático
        t2_BDJC objeto = new t2_BDJC();
        objeto.metodoNoEstatico();
        
        //Metodo que retorna un valor int
        int resultadoSuma = objeto.sumar(5, 3);
        System.out.println("La suma es: " + resultadoSuma);
        
        //Metodo que retorna un valor double
        double resultadoMultiplicacion = objeto.multiplicar(2.5, 4.2);
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);
        
        //Metodo que retorna un valor String
        String saludo = objeto.saludar("Jose");
        System.out.println(saludo);
        
        //Metodo que retorna un valor boolean
        boolean comparacion = objeto.esMayorQue(10, 5);
        System.out.println("¿10 es mayor que 5?: " + comparacion);
        
        //Metodo privado
        objeto.metodoPrivado();

        //Metodo protegido
        objeto.metodoProtegido();
    }
}
