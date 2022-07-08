
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Persona est = new Persona("José", 23);
        Persona est2 = new Persona("Eric", 21);
        Persona est3 = new Persona("Karla", 18);
        Persona est4 = new Persona("Félix", 26);
        
        ArrayList <Persona> listado = new ArrayList();
        
        listado.add(est);
        listado.add(est2);
        listado.add(est3);
        listado.add(est4);
        
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(listado);
        operaciones.establecerPromedioEdades();
        
        System.out.printf("%s\n", operaciones);    
    }
}
