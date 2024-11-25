public class Persona {
        // Atributos
    // Metodos: get, set, constructor, otros para funcion del usuario
    private String nombre;
    private float estatura;
    private boolean activo; // default false
    private String curp; // Probar con otros accesos

    // Constructor datos iniciales, default
    public Persona(){
        this.nombre = "pendiente";
        this.estatura = 0;
        activo = false;
    }

    public Persona(String nombre, float estatura, boolean activo){
        this.nombre = nombre;
        this.estatura = estatura;
        activo = activo;
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
        this.estatura = 0;
        activo = false;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", estatura=" + estatura + ", activo=" + activo + ", CURP=" + curp + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getCurp() {
        return curp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    // Otros metodos
    public void crece(float valor){
        this.estatura += valor;
    }
    

}
