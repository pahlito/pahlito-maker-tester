package cl.pahlito.maker.tester.core.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "cl.pahlito.maker.tester.core.entity")
@EnableJpaRepositories(basePackages = "cl.pahlito.maker.tester.core.repository")
public class TesterPersistenceContext {

}
