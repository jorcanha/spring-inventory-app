package spring.app.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.app.inventory.model.entity.Productos;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, buscar productos por nombre
    List<Productos> findByNombre(String nombre);
}