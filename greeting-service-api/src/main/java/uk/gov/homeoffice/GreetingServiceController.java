package uk.gov.homeoffice;

import org.springframework.web.bind.annotation.*;

@RestController("/greetings")
public class GreetingServiceController {

    private static final String TEMPLATE = "Hello, %s";

    @RequestMapping("/names/{name}")
    @ResponseBody
    public String sayHello(@PathVariable("name") String name) {
        return String.format(TEMPLATE, name);
    }

}
