package ee.inbank.heroes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return new Greeting(String.format("hello %s", name));
    }

}