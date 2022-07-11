package paquete10;

public class APIAmazonMovie implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%d", ak, 909090);
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
