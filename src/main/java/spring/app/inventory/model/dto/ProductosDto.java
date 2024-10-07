package spring.app.inventory.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProductosDto {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Nombre is mandatory")
    private String nombre;

    @NotBlank(message = "Descripción is mandatory")
    private String descripcion;

    @NotNull(message = "Precio cannot be null")
    private Double precio;

    private boolean disponibilidad;

    @NotNull(message = "Cantidad cannot be null")
    private int cantidad; // Cantidad total en inventario

    @NotNull(message = "Categoria ID cannot be null")
    private Long categoriaId; // ID de la categoría

    private List<Long> proveedoresIds; // Opcional, lista de IDs de proveedores
}