package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Additionen;
import ch.zli.m223.punchclock.service.AdditionenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/additionen")
public class AdditionController {

    @Autowired
    private AdditionenService additionenService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Additionen> findAllAddition() {
        return additionenService.findAll();
    }

    @PostMapping(value = "/{zahlEins}/{zahlZwei}")
    @ResponseStatus(HttpStatus.CREATED)
    public Long addiereZahlen(@PathVariable(name = "zahlEins") Long ersteZahl, @PathVariable(name = "zahlZwei") Long zahlZwei) {
        return additionenService.addiereZahlen(ersteZahl, zahlZwei);
    }
}
