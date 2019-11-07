package ch.calculator.controller;

import ch.calculator.domain.Divisionen;
import ch.calculator.service.DivisionenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/divisionen")
public class DivisionenController {

    @Autowired
    private DivisionenService divisionenService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Divisionen> findAllDivisionen() {
        return divisionenService.findAll();

    }

    @PostMapping(value = "/{zahlEins}/{zahlZwei}")
    @ResponseStatus(HttpStatus.CREATED)
    public Long dividiereZahlen(@PathVariable(name = "zahlEins") Long ersteZahl, @PathVariable(name = "zahlZwei") Long zahlZwei) {
        return divisionenService.dividiereZahlen(ersteZahl, zahlZwei);
    }
}

