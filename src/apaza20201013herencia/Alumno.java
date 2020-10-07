package apaza20201013herencia;
import java.util.ArrayList;
public class Alumno extends Persona {
    private int padron;
    private ArrayList<Float> notas;

    public Alumno(int padron, String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
        this.padron = padron;
        this.notas = new ArrayList<Float>();
    }

    public Alumno(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }
    
    public void setPadron(int padron) {
        this.padron = padron;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }    

    public int getPadron() {
        return padron;
    }
    
    public ArrayList<Float> getNotas() {
        return notas;
    }
//Aca agrego un metodo que reciba las notas desde el main
    public void agregarNota(float not){
        notas.add(not);
    }
//Aca sumo todas las notas de la lista notas    
    public float sumarNotas(){
        float sumador = 0;
        //notas.forEach((n) -> sumador = sumador + n); NO FUNCIONA??????????
        for(int i = 0; i < notas.size(); i++){
            sumador = sumador + notas.get(i);
        }
        return sumador;
    }
//Aca obtengo la cantidad de elementos que tiene mi ArrayList     
    public int contarNotas(){
        return notas.size();
    }
//Reutilizando los 2 anteriores metodos obtengo el promedio del alumno
    public float getPromedio(){
        float prom;
        if(contarNotas() == 0){
            prom = 0;
        }else{
            prom = sumarNotas() / contarNotas();
        }
        return prom;
    }
    
    public void mostrar() {
        System.out.println("Los atributos de la clase alumno son:" +
//No puedo hacer que muestre los atributos que se hereda de la clase persona
                /*"\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDNI: " + dni +*/
                "\nPadron: " + padron);
    }
}
