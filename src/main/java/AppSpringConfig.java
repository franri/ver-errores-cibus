import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class AppSpringConfig {

    @Bean
    public BackendService backendService(){
        BackendService bs = null;
        //código para unir por RMI
        //TO DO Zufra, tu magia

        return bs;
    }

    @Bean
    @Scope("singleton")
    public searchPageController searchPageController() {
        return new searchPageController();
    }

}
