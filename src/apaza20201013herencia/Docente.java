package apaza20201013herencia;
public class Docente extends Persona {
    private int legajo;
    private short antiguedad;

    public Docente(int legajo, short antiguedad, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.antiguedad = antiguedad;
    }

    public Docente(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setAntiguedad(short antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getLegajo() {
        return legajo;
    }

    public short getAntiguedad() {
        return antiguedad;
    }
    
    public void mostrar(){
        System.out.println("Los atributos de la clase docente son:" +
                "\nLegajo: " + legajo +
                "\nAntiguedad: " + antiguedad + " años");
    }
}
