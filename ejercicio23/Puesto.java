public class Puesto {
    private int num;
    private int id;
    private int salario;
    private String nombre;

    public Puesto(int id, int salario, String nombre){
        this.id = id; // No se especifica
        this.salario = salario; // Semanal
        this.nombre = nombre;
    }

    public Puesto(){
        this.salario = 1800; // Semanal
        this.nombre = nombre;
        this.num = 0; // No se especifica
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Puesto [num=" + num + ", salario=" + salario + ", nombre=" + nombre + "]";
    }

    

}
