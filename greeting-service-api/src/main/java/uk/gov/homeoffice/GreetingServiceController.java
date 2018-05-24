package uk.gov.homeoffice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greetings")
public class GreetingServiceController {

    @RequestMapping("/name")
    public String hello() {
        return "Hello";
    }

}
