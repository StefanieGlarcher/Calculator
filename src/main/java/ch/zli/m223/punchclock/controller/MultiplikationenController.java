package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Multiplikationen;
import ch.zli.m223.punchclock.service.MultiplikationenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/multiplikationen")
public class MultiplikationenController {
    @Autowired
    private MultiplikationenService multiplikationenService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Multiplikationen> findAllMultiplikationen() {
        return multiplikationenService.findAll();

    }

    @PostMapping(value = "/{zahlEins}/{zahlZwei}")
    @ResponseStatus(HttpStatus.CREATED)
    public Long multipliziereZahlen(@PathVariable(name = "zahlEins") Long ersteZahl, @PathVariable(name = "zahlZwei") Long zahlZwei) {
        return multiplikationenService.multipliziereZahlen(ersteZahl, zahlZwei);
    }
}
