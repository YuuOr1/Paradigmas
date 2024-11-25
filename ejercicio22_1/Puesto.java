public class Puesto {
    private int salario;
    private String nombre;

    public Puesto(){
        this.salario = 1800; // Semanal
        this.nombre = nombre;
    }

    public Puesto(int salario, String nombre){
        this.salario = salario; // Semanal
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Puesto [salario=" + salario + ", nombre=" + nombre + "]";
    }

    

}
