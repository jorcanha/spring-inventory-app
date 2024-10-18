package spring.app.inventory.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class ProductsDto {

    @NotNull(message = "UUID cannot be null")
    private UUID uuid;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Description is mandatory")
    private String description;

    @NotNull(message = "Price is mandatory")
    private BigDecimal unitPrice;

    private boolean availability;

    @NotBlank(message = "Unit Measurement is mandatory")
    private String unitMeasurement;

    @NotNull(message = "Quantity is mandatory")
    @Min(value = 0, message = "Quantity cannot be less than zero")
    private Integer quantity;

    @NotNull(message = "Category ID cannot be null")
    private Long categoriaId;

    private List<Long> proveedoresIds;
}