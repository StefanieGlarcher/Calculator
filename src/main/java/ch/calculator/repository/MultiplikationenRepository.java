package ch.calculator.repository;

import ch.calculator.domain.Multiplikationen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultiplikationenRepository extends JpaRepository<Multiplikationen, Long> {
}
