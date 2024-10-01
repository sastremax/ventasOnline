package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventasOnline.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {
}
