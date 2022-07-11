/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

public class Principal3 {

    public static void main(String[] args) {

        String nombreArchivo = "peliculas.data";
        
        /*ArrayList<GeneradorPeliculas> gP = new ArrayList<>();
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        gP.add(gp);
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        gP.add(gp2);
        
        System.out.println("---------------------------");
        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("AbC43543");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());
        gP.add(gp3);
        
        System.out.println("---------------------------");
        
        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("Tv415027");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4.obtenerUrl());
        gP.add(gp4);
        
        System.out.println("---------------------------");
        
        
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial
        (nombreArchivo);
        for (int i = 0; i < gP.size(); i++) {
        archivo.establecerRegistroPeliculas(gP.get(i));
        archivo.establecerSalida();
        }
        archivo.cerrarArchivo();*/
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
        (nombreArchivo);
        lectura.establecerPeliculas();
        System.out.println(lectura);
    }
}
