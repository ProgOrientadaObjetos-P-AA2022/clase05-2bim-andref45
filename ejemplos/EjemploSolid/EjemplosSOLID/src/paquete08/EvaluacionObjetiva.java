
package paquete08;

/**
 *
 * @author reroes
 */
public class EvaluacionObjetiva implements EvaluacionTipoUno {

    protected double promedioObjetivas;
    private int numeroPreguntas;
    private double totalPreguntas;

    public void establecerNumeroPreguntas(int n) {
        numeroPreguntas = n;
    }

    public void establecerTotalPreguntas(double n) {
        totalPreguntas = n;
    }

    public int obtenerNumeroPreguntas() {
        return numeroPreguntas;
    }

    public double obtenerTotalPreguntas() {
        return totalPreguntas;
    }

    @Override
    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }

    @Override
    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }

    
}
