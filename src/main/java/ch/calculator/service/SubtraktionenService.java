package ch.calculator.service;

import ch.calculator.repository.SubtraktionenRepository;
import ch.calculator.domain.Subtraktionen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtraktionenService {

    @Autowired
    private SubtraktionenRepository subtraktionenRepository;


    public List<Subtraktionen> findAll() {
        return subtraktionenRepository.findAll();
    }

    public Long subtrahiereZahlen(Long ersteZahl, Long zahlZwei) {
        return ersteZahl - zahlZwei;
    }
}
