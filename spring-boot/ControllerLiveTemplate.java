import org.springframework.stereotype.Controller;

@Controller
public class $NAME$Controller {
    
    private $NAME$Repository repository;
    
    public $NAME$Controller($NAME$Repository repository) {
        this.repository = repository;
    }
    
}