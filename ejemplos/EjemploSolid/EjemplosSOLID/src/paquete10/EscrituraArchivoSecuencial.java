
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class EscrituraArchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private GeneradorPeliculas registroPeliculas;
    private ArrayList<GeneradorPeliculas> listaPeliculas;

    public EscrituraArchivoSecuencial(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaPeliculas(); 
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaPeliculas().size() > 0) {
                for (int i = 0; i < obtenerListaPeliculas().size(); i++) {
                    establecerRegistroPeliculas(obtenerListaPeliculas().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } 
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistroPeliculas(GeneradorPeliculas p) {
        registroPeliculas = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroPeliculas);
            
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    public void establecerListaPeliculas() {
        LecturaArchivoSecuencial l = 
                new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerPeliculas();
        listaPeliculas = l.obtenerPeliculas();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<GeneradorPeliculas> obtenerListaPeliculas() {
        return listaPeliculas;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try 
        {
            if (salida != null) {
                salida.close();
            }
        }
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } 
    } 

}
