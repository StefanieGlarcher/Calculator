package ch.calculator.controller;

import ch.calculator.domain.Subtraktionen;
import ch.calculator.service.SubtraktionenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subtraktionen")
public class SubtraktionController {

    @Autowired
    private SubtraktionenService subtraktionenService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Subtraktionen> findAllSubtraktionen() {
        return subtraktionenService.findAll();

    }

    @PostMapping(value = "/{zahlEins}/{zahlZwei}")
    @ResponseStatus(HttpStatus.CREATED)
    public Long subtrahiereZahlen(@PathVariable(name = "zahlEins") Long ersteZahl, @PathVariable(name = "zahlZwei") Long zahlZwei) {
        return subtraktionenService.subtrahiereZahlen(ersteZahl, zahlZwei);
    }
}
