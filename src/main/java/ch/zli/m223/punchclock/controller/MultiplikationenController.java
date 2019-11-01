package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Multiplikationen;
import ch.zli.m223.punchclock.service.MultiplikationenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
}
