package com.thepracticaldeveloper.jbosswildflydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/hola")
@Slf4j
public final class HolaController {

    @GetMapping
    public String dimeHola(){
        String message = "Hola Amigo!";
        log.info("################Controller Invoked");
        return message;
    }
}
