package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventasOnline.entity.Cliente;

public interface VentasRepository extends JpaRepository<Cliente, Long> {
}
