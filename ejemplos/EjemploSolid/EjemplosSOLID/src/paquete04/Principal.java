/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerTransvia("Quito");
        transvia.establecerTarifa();
        
        ArrayList <Transporte> t = new ArrayList();
        t.add(bus);
        t.add(taxi);
        t.add(transvia);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(t);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
