package paquete03;

/**
 *
 * @author reroes
 */
public class TransporteTaxi {

    private String cooperativaTaxi;
    private double tarifa;

    public void establecerCooperativaTaxi(String n) {
        cooperativaTaxi = n;
    }

    public void establecerTarifa() {
        tarifa = 0.40 + (0.40 * 0.5);
    }

    public String obtenerCooperativaTaxi() {
        return cooperativaTaxi;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
