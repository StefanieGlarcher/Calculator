package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Additionen;
import ch.zli.m223.punchclock.domain.Subtraktionen;
import ch.zli.m223.punchclock.service.AdditionenService;
import ch.zli.m223.punchclock.service.SubtraktionenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
}
