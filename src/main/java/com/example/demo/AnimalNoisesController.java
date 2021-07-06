package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AnimalNoisesController {

    @RequestMapping("/")
    public String test(@RequestParam(value = "msg", defaultValue = "Hello World!") String message){
        animalNoises returnMsg = new animalNoises();
        return returnMsg.getFromDict(message);
    }


}
