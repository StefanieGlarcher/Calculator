package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Divisionen;
import ch.zli.m223.punchclock.repository.DivisionenRepository;
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
