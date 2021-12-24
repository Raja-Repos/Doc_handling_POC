package docsStorage.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "docsStorage.com")
public class DocsStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocsStorageApplication.class, args);
	}

}
