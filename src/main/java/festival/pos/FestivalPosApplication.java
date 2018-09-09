package festival.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = { "classpath:${jdbc.config}" })
public class FestivalPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FestivalPosApplication.class, args);
	}
}
