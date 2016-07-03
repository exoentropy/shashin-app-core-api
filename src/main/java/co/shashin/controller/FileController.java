package co.shashin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class FileController {

    @RequestMapping(value = "file", method = RequestMethod.GET)
    public String getFile(String uuid) {
        return uuid;
    }

}
