public class Empleado extends Persona {
    private double tiempo; //El tiempo es la antiguadad en años
    private int id;
    private  char turno; // Matutino, vespertino, nocturno
    private Puesto actividad;
    // puesto
    // si no hay constructor lo toma de la clase padre

    public Empleado(double tiempo, char turno){
        this.tiempo = tiempo;
        this.turno = turno;
        this.actividad = null;
    }

    @Override
    public String toString() {
        return "Empleado [tiempo=" + tiempo + ", id=" + id + ", turno=" + turno + ", actividad=" + actividad
                + ", getNombre()=" + getNombre() + "]";
    }

    public void crece(float valor){
        this.tiempo += valor;
    }

    public double gettiempo() {
        return tiempo;
    }
    public int getId() {
        return id;
    }
    public char getTurno() {
        return turno;
    }
    public void settiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTurno(char turno) {
        this.turno = turno;
    }

    public Puesto getActividad() {
        return actividad;
    }

    public void setActividad(Puesto actividad) {
        this.actividad = actividad;
    }

    

}
