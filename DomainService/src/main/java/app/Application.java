package app;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		new SpringApplication(Application.class).run(args);
	}
}
