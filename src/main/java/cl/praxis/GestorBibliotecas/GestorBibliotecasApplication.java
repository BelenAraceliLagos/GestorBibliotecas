package cl.praxis.GestorBibliotecas;



import io.lsn.logger.factory.LoggerFactory;
import io.lsn.logger.factory.logger.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GestorBibliotecasApplication {

	private static final Logger logger = LoggerFactory.getLogger(GestorBibliotecasApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(GestorBibliotecasApplication.class, args);
		logger.info("Iniciando Gestor de Bibliotecas");
	}

}
