package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Subtraktionen;
import ch.zli.m223.punchclock.repository.SubtraktionenRepository;
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
