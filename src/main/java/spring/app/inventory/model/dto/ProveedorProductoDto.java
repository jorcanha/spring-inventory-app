package spring.app.inventory.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProveedorProductoDto {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotNull(message = "Proveedor ID cannot be null")
    private Long proveedorId; // ID del proveedor

    @NotNull(message = "Producto ID cannot be null")
    private Long productoId; // ID del producto

    @NotNull(message = "Precio del proveedor cannot be null")
    private Double precioProveedor;

    private String nombre; // Opcional
}