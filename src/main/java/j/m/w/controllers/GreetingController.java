package j.m.w.controllers;

import java.util.concurrent.atomic.AtomicLong;

import j.m.w.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
;

/**
 * Jackson is the library that converts all objects to JSON in the response body in case you need to read up on the specifics
 */
@RestController
// shorthand for @Controller and @ResponseBody, basically means this controller returns domain objects in JSON
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
