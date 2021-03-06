package one.digitalinnovation.gerenciamentodepessoas.domain.repository.contributors;

import one.digitalinnovation.gerenciamentodepessoas.domain.model.contributors.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Long> {
    Optional<Gerente> findByEmail(String email);
}
