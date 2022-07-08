
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteTaxi extends Transporte {

    private String cooperativaTaxi;

    public void establecerCooperativaTaxi(String n) {
        cooperativaTaxi = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.40 + (0.40 * 0.5);
    }

    public String obtenerCooperativaTaxi() {
        return cooperativaTaxi;
    }

}
