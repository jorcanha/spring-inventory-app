package spring.app.inventory.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productos")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false, nullable = false, unique = true)
    private UUID uuid;

    @NotBlank(message = "Name is mandatory")
    @Column(nullable = false, unique = true)
    private String name;

    @NotBlank(message = "Description is mandatory")
    @Column(nullable = false)
    private String description;

    @NotNull(message = "Price is mandatory")
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(nullable = false)
    private boolean availability;

    @NotBlank(message = "Unit Measurement is mandatory")
    @Column(nullable = false)
    private String unitMeasurement;

    @NotNull(message = "Quantity is mandatory")
    @Min(value = 0, message = "Quantity cannot be less than zero")
    @Column(nullable = false)
    private Integer quantity;
}