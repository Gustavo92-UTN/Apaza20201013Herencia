package apaza20201013herencia;
public class Apaza20201013Herencia {
    public static void main(String[] args) {
        Persona p1 = new Persona("Paula", "Gomez", 87654321);
        Docente d1 = new Docente(1234567, (short) 13, "Paula", "Gomez", 87654321);
        Alumno a1 = new Alumno(123, "Mario", "Mileto", 12345678);
        
        a1.agregarNota(7.5f);   //se le agrega f para que tome solo una cierta cantidad de decimales
        a1.agregarNota(6);
        a1.agregarNota(3.8f);
        
        p1.mostrar();
        System.out.println();
        d1.mostrar();
        System.out.println();
        a1.mostrar();
        System.out.println("Las notas del alumno son: " + a1.getNotas());
        System.out.println("El promedio del alumno es: " + a1.getPromedio());
        
    }
    
}
