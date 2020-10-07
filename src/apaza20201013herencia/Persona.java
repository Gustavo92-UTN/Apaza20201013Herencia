package apaza20201013herencia;
public class Persona {
    private String nombre;
    private String apellido;
    private long dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public void mostrar(){
        System.out.println("Los atributos de la clase persona son:" +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDNI: " + dni);
    }
    
}
