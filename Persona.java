/*
    NOMBRE DEL ARCHIVO: Persona.java
    DESARROLLADO POR: Francisco Castillo 21562
    HISTORIAL DE MODIFICACIONES
        null
*/
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /** 
     * @return int La edad de las personas
     */
    public int getEdad(){
        return edad;
    }
}
