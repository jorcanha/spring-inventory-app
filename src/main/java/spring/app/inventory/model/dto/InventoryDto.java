package spring.app.inventory.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class InventoryDto {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotNull(message = "Producto ID cannot be null")
    private Long productoId;

    @NotNull(message = "Cantidad cannot be null")
    private int cantidad;

    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
}