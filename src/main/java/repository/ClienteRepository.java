package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventasOnline.entity.Ventas;

public interface ClienteRepository extends JpaRepository<Ventas, String> {
}
