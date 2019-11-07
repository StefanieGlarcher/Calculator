package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Divisionen;
import ch.zli.m223.punchclock.service.DivisionenService;
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

