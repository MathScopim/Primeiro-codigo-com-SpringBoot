package Dio.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import src.main.java.Dio.SpringBoot.app.app.ViaCepResponse;
import src.main.java.Dio.SpringBoot.app.app.ConversorJson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		@Bean
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		public CommandLineRunner run(ConversorJson conversor) throws Exception {
			return args -> {
				String json = "{\"cep\": \"01001-00\",\"Logradouro\": \"praça da sé\",\"Localidade\": \"São Paulo\";
				ViaCepResponse response = conversor.converter(json);
				System.out.println("Dados do CEP: " = response);
			};
		}
	}
	@Configuration
	public class Beans {
		@Bean
		public Gson gson() {
			return new Gson();
		}
	}
}
