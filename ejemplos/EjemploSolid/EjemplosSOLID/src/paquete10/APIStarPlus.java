package paquete10;

public class APIStarPlus implements APIMovie {

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%d", ak, 979064);
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
