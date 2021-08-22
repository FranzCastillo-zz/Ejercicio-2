/*
    NOMBRE DEL ARCHIVO: Perrera.java
    DESARROLLADO POR: Francisco Castillo 21562
    HISTORIAL DE MODIFICACIONES
        asignarPerro no necesita recibir perro, puede hacer el .pop desde el mismo ambito
        asignarPerro devuelve un String hacia donde fue asignado
        propiedad iPerrera
        -felicitar(Familia actual, Perro perroActual): 
*/
import java.util.Stack;

public class Perrera {
    private Familia[] familias;
    private Perro[] espacioPerrera;
    private int iFamilia;
    private Stack<Perro> perros;
    private int iPerrera;

    public Perrera() {
        familias = new Familia[15];
        familias[0] = new Familia("Castillo");
        familias[1] = new Familia("Cerna");
        familias[2] = new Familia("Perez");
        iFamilia = 3; // POSICION DE FAMILIA
        iPerrera = 0; // POSICION PERRERA
        perros = new Stack<>();
        espacioPerrera = new Perro[15];
    }

    
    /** 
     * @param f es la instancia de familia que se desea registrar en la perrera
     */
    public void recibirFamilia(Familia f) {
        familias[iFamilia++] = f;
    }

    
    /** 
     * @param datos es el arreglo de datos que contiene la informacion del perro a registrar
     */
    public void recibirPerro(String[] datos) {
        Perro p = new Perro(datos);
        perros.push(p);
    }

    
    /** 
     * @param actual representa la familia a felicitar por recibir un perro
     * @param perroActual es el perro que se le ha asignado a la familia
     * @return String el texto a imprimir para la felicitacion
     */
    private String felicitar(Familia actual, Perro perroActual) {
        actual.agregarMascota(1);
        return "Felicidadaes! " + perroActual.getNombre() + " puede ser alojado por la familia " + actual.getApellido();
    }

    
    /** 
     * @return String el texto del resultado de la asignacion del perro
     */
    public String asignarPerro() {
        String texto = "";
        if (!perros.empty()) {
            Perro perroActual = perros.pop();
            String raza = perroActual.getRaza();
            String tamanio = perroActual.getTamanio();
            boolean peligroso = perroActual.getPeligroso();
            boolean encontroFamilia = false;

            for (int i = 0; i < familias.length - 1 && !encontroFamilia; i++) {
                if (familias[i] != null) {
                    Familia actual = familias[i]; // La familia que se esta analizando en el momento
                    int[] miembros = actual.getMiembros(); // [adultos, pequenios, grandes]

                    if (actual.getMascotas() < 4) {
                        if (miembros[1] > 0) {
                            if (!peligroso && tamanio.equals("pequenio") || raza.equals("labrador")) {
                                texto = felicitar(actual, perroActual);
                                encontroFamilia = true;
                            }
                        } else if (miembros[2] > 0) {
                            if (!peligroso && tamanio.equals("pequenio") || tamanio.equals("mediano")) {
                                texto = felicitar(actual, perroActual);
                                encontroFamilia = true;
                            }
                        } else {
                            texto = felicitar(actual, perroActual);
                            encontroFamilia = true;
                        }
                    }
                }
            }
            if (!encontroFamilia) {
                texto = perroActual.getNombre() + " no puede ser alojado por una familia, " + perroActual.getNombre()
                        + " se alojara en el refugio";
                espacioPerrera[iPerrera++] = perroActual;
            }
        } else {
            texto = "No hay perros por asignar!";
        }
        return texto;
    }
}