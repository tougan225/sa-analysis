package yeligninfarm.sa_analysis.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yeligninfarm.sa_analysis.entities.Sa;

import java.util.List;

@RestController
@RequestMapping(path = "sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    List<Object> search() {
        return List.of(new Sa(1, "Belle formation", 1));
    }
}
