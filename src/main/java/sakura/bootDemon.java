package sakura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
public class bootDemon {
  @RequestMapping("/")
  public String index() {
	  return "lijianlongboot";
  }
  public static void main(String [] args) throws Exception{
  }
}
