
package paquete03;

/**
 *
 * @author reroes
 */
public class TiposTransporte {

    private double promedioTarifas;
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    private TransporteTransvia transvia;
    //private TransporteAereo aereo;
    //private TransporteMaritimo maritimo;

    public void establecerTransporteTaxi(TransporteTaxi taxi) {
        ttaxi = taxi;
    }

    public void establecerTransporteBus(TransporteBus bus) {
        ttbus = bus;
    }

    public void establecerTransporteTransvia(TransporteTransvia tr) {
        transvia = tr;
    }

    public TransporteTaxi obtenerTransporteTaxi() {
        return ttaxi;
    }

    public TransporteBus obtenerTransporteBus() {
        return ttbus;
    }

    public TransporteTransvia obtenerTransporteTransvia() {
        return transvia;
    }

    public void establecerPromedioTarifas() {
        promedioTarifas = (obtenerTransporteBus().obtenerTarifa()
                + obtenerTransporteTaxi().obtenerTarifa()
                + obtenerTransporteTransvia().obtenerTarifa()) / 2;

    }

    public double obtenerPromedioTarifas() {
        return promedioTarifas;
    }

}
