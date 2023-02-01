package uic.carrera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CarreraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarreraApplication.class, args);
	}

}
