import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class $NAME$CommandLineRunner implements CommandLineRunner {

    private $NAME$Repository repository;

    public $NAME$CommandLineRunner($NAME$Repository repository)  {
        this.repository = repository;
    }

    @Override
    public void run(String...args) throws Exception {
    }
}