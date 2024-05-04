package com.develhope.proveSpringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class PersonController {

    @GetMapping(path = "ciao/{provincia}")
    public Person person(
            @PathVariable String provincia,
            @RequestParam String nome
    ) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new Person(nome, provincia);
    }
}

