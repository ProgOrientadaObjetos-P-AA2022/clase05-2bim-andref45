package paquete10;

public class APINetflix implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%d", ak, 123123);
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
