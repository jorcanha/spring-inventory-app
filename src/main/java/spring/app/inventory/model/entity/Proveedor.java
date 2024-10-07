package spring.app.inventory.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Nombre obligatorio")
    private String nombre;

    @NotBlank(message = "Contacto obligatorio")
    private String contacto;

    @NotBlank(message = "Teléfono obligatorio")
    private String telefono;

    @NotBlank(message = "Email obligatorio")
    private String email;

    @NotBlank(message = "Dirección obligatoria")
    private String direccion;

    // Relación uno a muchos con ProveedorProducto
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProveedorProducto> productos; // Relación con ProveedorProducto


}