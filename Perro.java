/*
    NOMBRE DEL ARCHIVO: Perro.java
    DESARROLLADO POR: Francisco Castillo 21562
    HISTORIAL DE MODIFICACIONES
        Necesita tambien un getPeligroso 
*/
public class Perro {
    
    private String tamanio;
    private String raza;
    private int edad;
    private int salud;
    private String color;
    private final String[] razasPeligrosas = {"pit bull terrier",
        "american staffordshire terrier",
        "tosa inu",
        "dogo argentino",
        "dogo guatemalteco",
        "fila brasilenio",
        "presa canario",
        "doberman",
        "gran perro japones",
        "mastin napolitano",
        "presa mallorqui",
        "dogo de burdeos",
        "bullmastiff",
        "bull terrier ingles",
        "bulldog americano",
        "rhodesiano",
        "rottweiler"};
    private boolean peligroso;
    private String nombre;
    public Perro(String[] datos){ //setPeligroso aqui
        tamanio = datos[0];
        raza = datos[1];
        edad = Integer.parseInt(datos[2]);
        salud = Integer.parseInt(datos[3]);
        color = datos[4];

        peligroso = false;
        for(int i = 0; i < razasPeligrosas.length && !peligroso; i++){ //Si es de raza peligrosa le cambia el valor
            if(datos[1].equals(razasPeligrosas[i])){
                peligroso = true;
            }
        }

        nombre = datos[5];
    }
    
    /** 
     * @return String La raza del perro en la instancia
     */
    public String getRaza(){
        return raza;
    }
    
    /** 
     * @return String El tamanio del perro en la instancia
     */
    public String getTamanio(){
        return tamanio;
    }
    
    /** 
     * @return String El nombre del perro en la instancia
     */
    public String getNombre(){
        return nombre;
    }
    
    /** 
     * @return boolean si es peligroso (true) o no (false)
     */
    public boolean getPeligroso(){
        return peligroso;
    }
}