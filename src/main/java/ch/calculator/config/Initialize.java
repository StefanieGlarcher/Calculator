package ch.calculator.config;

import ch.calculator.domain.Additionen;
import ch.calculator.domain.Divisionen;
import ch.calculator.domain.Multiplikationen;
import ch.calculator.domain.Subtraktionen;
import ch.calculator.repository.AdditionenRepository;
import ch.calculator.repository.DivisionenRepository;
import ch.calculator.repository.MultiplikationenRepository;
import ch.calculator.repository.SubtraktionenRepository;
import ch.calculator.domain.*;
import ch.calculator.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Initialize {

    @Autowired
    private AdditionenRepository additionenRepository;

    @Autowired
    private SubtraktionenRepository subtraktionenRepository;

    @Autowired
    private MultiplikationenRepository multiplikationenRepository;

    @Autowired
    private DivisionenRepository divisionenRepository;

    @PostConstruct
    public void initialize(){

        Additionen additionen = new Additionen(1, 10, 10, 12);
        additionen = additionenRepository.save(additionen);

        Subtraktionen subtraktionen = new Subtraktionen(1, 10, 5, 20);
        subtraktionen = subtraktionenRepository.save(subtraktionen);

        Multiplikationen multiplikationen = new Multiplikationen(1, 10, 5, 5);
        multiplikationen = multiplikationenRepository.save(multiplikationen);

        Divisionen divisionen = new Divisionen(1, 50, 10, 100);
        divisionen = divisionenRepository.save(divisionen);

    }

}
