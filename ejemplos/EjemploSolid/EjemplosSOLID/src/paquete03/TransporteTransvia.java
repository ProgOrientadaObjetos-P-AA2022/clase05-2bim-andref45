package paquete03;

/**
 *
 * @author reroes
 */
public class TransporteTransvia {

    private String transvia;
    public double tarifa;

    public void establecerTransvia(String n) {
        transvia = n;
    }

    public void establecerTarifa() {
        tarifa = 4.00 + 0.60;
    }

    public String obtenerTransvia() {
        return transvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
