package open.feign.lab07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Lab07Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab07Application.class, args);
	}

}
