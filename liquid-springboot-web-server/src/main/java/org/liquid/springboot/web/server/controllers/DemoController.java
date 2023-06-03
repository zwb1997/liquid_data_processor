package org.liquid.springboot.web.server.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/api/getstring")
    public List<String> getString() {
        return List.of("hello", "world");
    }
}
