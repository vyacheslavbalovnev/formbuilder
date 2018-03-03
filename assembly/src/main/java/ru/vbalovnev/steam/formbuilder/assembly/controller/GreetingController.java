package ru.vbalovnev.steam.formbuilder.assembly.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vbalovnev.steam.formbuilder.assembly.model.Greeting;
import ru.vbalovnev.steam.formbuilder.service.DataService;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private DataService dataService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(
            counter.incrementAndGet(),
            String.format(template, name),
            dataService.getData()
        );
    }
}