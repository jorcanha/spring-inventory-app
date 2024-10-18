package spring.app.inventory.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Nombre is mandatory")
    private String nombre;

    private String descripcion;
}