/*
    NOMBRE DEL ARCHIVO: Vista.java
    DESARROLLADO POR: Francisco Castillo 21562
    HISTORIAL DE MODIFICACIONES
        Se agrego int pedirCantidadMiembros
        Se agrego void mostrar familia asignada
        Se agrego mostrarOpcionInvalida
*/
import java.util.Scanner;
public class Vista {
    private Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }
    public void saludar(){
        System.out.println("Hola! Bienvenido al refugio.");
    }
    public void despedir(){
        System.out.println("Feliz dia!");
    }
    
    /** 
     * @return int La opcion del menu seleccionada
     */
    public int mostrarMenu(){
        System.out.println("¿Que desea hacer ahora?");
        System.out.println("1. Registrar familia");
        System.out.println("2. Recibir perro");
        System.out.println("3. Asignar perro a una familia");
        System.out.println("4. Salir");
        int temp = scan.nextInt();
        scan.nextLine();
        return temp;
    }
    
    /** 
     * @return String el apellido ingresado por el usuario
     */
    public String pedirApellido(){
        //scan.nextLine();
        System.out.println("Ingrese el apellido que representa a su Familia: ");
        return scan.nextLine();
    }
    
    public void mostrarNoCumpleConCantidadDeMiembros(){
        System.out.println("Lo sentimos no cumple con los requisitos de cantidad de miembros");
    }
    public void mostrarNoMasPerro(){
        System.out.println("Gracias por sus intenciones! Pero ya tiene el maximo de perros");
    }
    public void mostrarNoMasFamilias(){
        System.out.println("Ya no se pueden registrar mas familia!");
    }
    
    /** 
     * @return String[] Los datos ingresador del perro [tamanio, raza, edad, salud, color, nombre]
     */
    public String[] pedirDatosPerro(){
        //scan.nextLine();
        String[] temp = new String[6];
        System.out.println("Ingrese el tamaño del perro: (Grande, Mediano, Pequenio)");
        temp[0] = scan.nextLine().toLowerCase();
        System.out.println("Ingrese la raza del perro:");
        temp[1] = scan.nextLine().toLowerCase();
        System.out.println("Ingrese la edad del perro:");
        temp[2] = scan.nextLine();
        System.out.println("Ingrese la salud del perro (en %)");
        temp[3] = scan.nextLine();
        System.out.println("Ingrese el color del perro");
        temp[4] = scan.nextLine();
        System.out.println("Ingrese el nuevo nombre del perro");
        temp[5] = scan.nextLine();
        return temp;
    }

    
    /** 
     * @param numeroDeMiembro Numero de miembro, el orden en el que pasan (Primer miembro, segundo miembro...)
     * @return String[] Los datos del miembro [nombre, edad]
     */
    public String[] pedirDatosMiembro(int numeroDeMiembro){
        //scan.nextLine();
        System.out.println("");
        String[] temp = new String[2];
        System.out.println("Ingrese el nombre del miembro " + numeroDeMiembro + ":");
        temp[0] = scan.nextLine();
        System.out.println("Ingrese la edad del miembro " + numeroDeMiembro + ": ");
        temp[1] = scan.nextLine();
        System.out.println("");
        return temp;
    }
    
    /** 
     * @return int la cantidad de miembros de la familia
     */
    public int pedirCantidadMiembros(){
        System.out.println("¿Cuantos miembros tiene su familia? (Maximo 10)");
        int temp = scan.nextInt();
        scan.nextLine();
        return temp;
    }
    
    /** 
     * @param texto el texto resultante de asignar una familia
     */
    public void mostrarFamiliaAsignada(String texto){
        System.out.println(texto);
    }
    public void mostrarOpcionInvalida(){
        System.out.println("Ha seleccionado una opcion invalida.");
    }
}
