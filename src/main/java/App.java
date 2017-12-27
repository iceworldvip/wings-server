import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * APP bootstrap
 *
 * @author ice
 * @version 1.0
 */
@ComponentScan(basePackages = "org.ice.wings.server")
@EntityScan(basePackages = "org.ice.wings.server.domain.model")
@EnableJpaRepositories(basePackages = "org.ice.wings.server.domain")
@EnableTransactionManagement
@SpringBootApplication
public class App {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

