package src.main.java.Dio.SpringBoot.app.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component

public class ConversorJson {
    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
