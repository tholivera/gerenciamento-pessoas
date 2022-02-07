package one.digitalinnovation.gerenciamentodepessoas.domain.repository.locations;

import one.digitalinnovation.gerenciamentodepessoas.domain.model.locations.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
