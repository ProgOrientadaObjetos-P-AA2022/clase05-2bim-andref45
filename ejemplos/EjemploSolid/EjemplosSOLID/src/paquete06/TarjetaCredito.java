package paquete06;

/**
 *
 * @author andreflores
 */
public class TarjetaCredito {

    private String nombre;
    private String cod;
    private double cupoM;

    public TarjetaCredito(String n, String c, double cM) {
        nombre = n;
        cod = c;
        cupoM = cM;
    }

    public void establecerNom(String n) {
        nombre = n;
    }

    public void establecerCod(String n) {
        cod = n;
    }

    public void establecerCupoMaximo(double n) {
        cupoM = n;
    }

    public String obtenerNom() {
        return nombre;
    }

    public String obtenerCod() {
        return cod;
    }

    public double obtenerCupoMaximo() {
        return cupoM;
    }
    
    @Override
    public String toString(){
       String cadena = String.format("%s - Cupo Máximo: %s\n", 
               nombre,
               cupoM);
       return cadena;
    }
}
