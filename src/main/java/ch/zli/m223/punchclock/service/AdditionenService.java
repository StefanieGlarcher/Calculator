package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Additionen;
import ch.zli.m223.punchclock.repository.AdditionenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionenService {

    @Autowired
    private AdditionenRepository additionenRepository;


    public List<Additionen> findAll() {
        return additionenRepository.findAll();
    }

    public Long addiereZahlen(Long ersteZahl, Long zahlZwei) {
        return ersteZahl + zahlZwei;
    }

    //  public Additionen addiereZahlen(Long zahlEins, Long zahlZwei) {
  //      return additionenRepository.saveAndFlush(additionen);
  //  }

}
