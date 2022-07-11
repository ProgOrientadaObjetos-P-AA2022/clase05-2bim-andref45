
package paquete07;

/**
 *
 * @author reroes
 */
public abstract class Evaluacion {
    
    protected double promedioObjetivas;
    protected double promedioEnsayo;
    
    public abstract void establecerPromedioObjetivas();
    public abstract double obtenerPromedioObjetivas();
    
    public abstract void establecerPromedioEnsayo();
    public abstract double obtenerPromedioEnsayo();
    
}
