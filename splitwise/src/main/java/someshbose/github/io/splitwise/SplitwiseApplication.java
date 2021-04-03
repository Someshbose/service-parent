package someshbose.github.io.splitwise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SplitwiseApplication {

	public static void main(String[] args) {

		log.info("Splitwise app is running!");
		SpringApplication.run(SplitwiseApplication.class, args);
	}

}
