/*
    NOMBRE DEL ARCHIVO: Main.java
    DESARROLLADO POR: Francisco Castillo 21562
    HISTORIAL DE MODIFICACIONES
        null
*/
public class Main {
    public static void main(String[] args) {
        Vista v = new Vista();
        Perrera p = new Perrera();

        v.saludar();
        while(true){
            System.out.println("");
            System.out.println("");
            int opcion = v.mostrarMenu();
            switch(opcion){
                case 1: // Nueva familia
                    int cantidad = v.pedirCantidadMiembros();
                    if(cantidad >= 2 && cantidad <= 10){
                        Persona[] miembros = new Persona[cantidad]; //10 es el maximo de miembros para fmailia
                        int i;
                        // ---------------------- PIDE LOS DATOS DE LOS MIEMBROS AL USUARIO
                        for(i = 0; i < cantidad; i++){
                            String[] temp = v.pedirDatosMiembro(i + 1);
    
                            int edad = Integer.parseInt(temp[1]); //La posicion 0 de temp es el nombre del miembro, la 1 es de edad.
                            Persona persona = new Persona(temp[0], edad);
    
                            miembros[i] = persona;
                        }
                        Familia tempF = new Familia(v.pedirApellido(), miembros);
                        p.recibirFamilia(tempF);
                    }else{
                        v.mostrarNoCumpleConCantidadDeMiembros();
                    }
                break;
                case 2: // Nuevo perro
                    p.recibirPerro(v.pedirDatosPerro());
                break;
                case 3: // Asignar perro a familia
                    String texto = p.asignarPerro();
                    v.mostrarFamiliaAsignada(texto);
                break;
                case 4: // Salir
                    v.despedir();
                    System.exit(1);
                break;
                default:
                    v.mostrarOpcionInvalida();
                break;
            }
        }
    }
}
