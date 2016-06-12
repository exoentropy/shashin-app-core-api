package co.shashin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    @RequestMapping("/")
    public String home() {
        return "First API method";
    }
}
