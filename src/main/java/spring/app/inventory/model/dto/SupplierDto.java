package spring.app.inventory.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SupplierDto {

    @NotNull(message = "ID cannot be null")
    private Long id;

    @NotBlank(message = "Nombre is mandatory")
    private String nombre;

    @NotBlank(message = "Contacto is mandatory")
    private String contacto;

    @NotBlank(message = "Teléfono is mandatory")
    private String telefono;

    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Dirección is mandatory")
    private String direccion;

    private List<Long> productosIds;
}