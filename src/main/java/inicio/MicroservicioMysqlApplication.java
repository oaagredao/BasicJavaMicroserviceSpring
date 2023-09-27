package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Se agregan anotaciones para indicar donde está el controlador y las clases importantes

@ComponentScan(basePackages = {"Controller","dao","service"} )
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"dao"})
@SpringBootApplication
public class MicroservicioMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioMysqlApplication.class, args);
	}

}
