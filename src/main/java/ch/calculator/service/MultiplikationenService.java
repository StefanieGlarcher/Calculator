package ch.calculator.service;

import ch.calculator.domain.Multiplikationen;
import ch.calculator.repository.MultiplikationenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultiplikationenService {

    @Autowired
    private MultiplikationenRepository multiplikationenRepository;

    public List<Multiplikationen> findAll() {return multiplikationenRepository.findAll(); }

    public Long multipliziereZahlen(Long ersteZahl, Long zahlZwei) {
        return ersteZahl * zahlZwei;
    }
}



