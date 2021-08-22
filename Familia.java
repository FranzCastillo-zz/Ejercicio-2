/*
    NOMBRE DEL ARCHIVO: Familia.java
    DESARROLLADO POR: Francisco Castillo 21562
    HISTORIAL DE MODIFICACIONES
        null
*/
import java.util.Random;
public class Familia{

    private Random rand;
    private String apellido;
    private Persona[] miembros;
    private int adultos;
    private int pequenios;
    private int grandes;
    private int mascotas;

    public Familia(String newApellido){
        rand = new Random();
        apellido = newApellido;
        adultos = 2;
        pequenios = rand.nextInt(3);
        grandes = rand.nextInt(3);
        mascotas = 0;
    }
    public Familia(String newApellido, Persona[] newMiembros){ //CALCULAR LAS EDADES
        rand = new Random();
        apellido = newApellido;
        miembros = newMiembros;
        for(int i = 0; i < miembros.length; i++){
            int edad = miembros[i].getEdad();
            if(edad <= 10){
                pequenios++;
            }else if (edad >= 10 && edad <= 18){
                grandes++;
            }else{
                adultos++;
            }
        }
        mascotas = 0;
    }
    
    /** 
     * @return String EL apellido de la familia
     */
    public String getApellido(){
        return apellido;
    }
    
    /** 
     * @return int[] La cantidad de miembros que la conforman [adultos, pequenios, grandes]
     */
    public int[] getMiembros(){
        int[] temp = {adultos, pequenios, grandes};
        return temp;
    }
    
    /** 
     * @param cantidad La cantidad de mascotas a agregar para esta familia
     */
    public void agregarMascota(int cantidad){
        mascotas += cantidad;
    }
    
    /** 
     * @return int La cantidad de mascotas asignadas en esta familia
     */
    public int getMascotas(){
        return mascotas;
    }
}