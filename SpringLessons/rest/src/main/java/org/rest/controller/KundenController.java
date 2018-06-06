package org.rest.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.rest.entities.Kunde;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KundenController {

    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/greeting")
    public Kunde greeting(
            @RequestParam(value = "name", defaultValue = "Thomas") String name) {
        return new Kunde(counter.incrementAndGet(), name);
    }
}
