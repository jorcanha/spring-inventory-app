package spring.app.inventory.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class productSupplierDto {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotNull(message = "UUID cannot be null")
    private UUID uuid;

    @NotNull(message = "Proveedor ID cannot be null")
    private Long proveedorId;

    @NotNull(message = "Producto ID cannot be null")
    private Long productoId;

    @NotNull(message = "Precio del proveedor cannot be null")
    private Double precioProveedor;

    private String nombre;
}