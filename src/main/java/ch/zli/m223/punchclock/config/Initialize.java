package ch.zli.m223.punchclock.config;

import ch.zli.m223.punchclock.domain.*;
import ch.zli.m223.punchclock.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class Initialize {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private KategorieRepository kategorieRepository;

    @Autowired
    private UserRepository userRepository;

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
        Kategorie kategorie = new Kategorie(1, "Test");
        kategorie = kategorieRepository.save(kategorie);

        User user = new User(1, "Steffi", "Steffi");
        user = userRepository.save(user);

        Additionen additionen = new Additionen(1, 10, 10, 12);
        additionen = additionenRepository.save(additionen);

        Subtraktionen subtraktionen = new Subtraktionen(1, 10, 5, 20);
        subtraktionen = subtraktionenRepository.save(subtraktionen);

        Multiplikationen multiplikationen = new Multiplikationen(1, 10, 5, 5);
        multiplikationen = multiplikationenRepository.save(multiplikationen);

        Divisionen divisionen = new Divisionen(1, 50, 10, 100);
        divisionen = divisionenRepository.save(divisionen);

        LocalDateTime localDateTime = LocalDateTime.now();
        Entry entry = new Entry(1, localDateTime, localDateTime);
        entryRepository.save(entry);

        Entry entry2 = new Entry(2, localDateTime, localDateTime, kategorie);
        entryRepository.save(entry2);

    }

}
