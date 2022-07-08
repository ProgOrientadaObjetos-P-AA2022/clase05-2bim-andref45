package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteTransvia extends Transporte {

    private String transvia;
    public double tarifa;

    public void establecerTransvia(String n) {
        transvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 3.00 + 0.60;
    }

    public String obtenerTransvia() {
        return transvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
