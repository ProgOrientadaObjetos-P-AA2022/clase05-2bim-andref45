
package paquete10;


public class APIDirectvGo implements APIMovie {
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = String.format("%s%d", ak, 45456);
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
