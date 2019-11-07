package ch.calculator.service;

import ch.calculator.domain.Divisionen;
import ch.calculator.repository.DivisionenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionenService {

    @Autowired
    private DivisionenRepository divisionenRepository;

    public List<Divisionen> findAll() {return divisionenRepository.findAll(); }

    public Long dividiereZahlen(Long ersteZahl, Long zahlZwei) {
        return ersteZahl / zahlZwei;
    }
}
