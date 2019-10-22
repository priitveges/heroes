package ee.inbank.heroes.controller;

import ee.inbank.heroes.dto.Greeting;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name = "name",
            required = false, defaultValue = "World") String name,
        @RequestHeader Map<String, String> headers) {
        return new Greeting(String.format("hello %s", name));
    }

}