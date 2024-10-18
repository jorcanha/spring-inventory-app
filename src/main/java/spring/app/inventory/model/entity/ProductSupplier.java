package spring.app.inventory.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;


@Data
 @Entity
 @Table(name = "proveedor_producto")
 public class ProductSupplier {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

    @Column(updatable = false, nullable = false, unique = true)
    private UUID uuid;

     private String nombre;

     @ManyToOne
     @JoinColumn(name = "proveedor_id", nullable = false)
     private Supplier supplier;

     @ManyToOne
     @JoinColumn(name = "producto_id", nullable = false)
     private Products producto;

     private Double precioProveedor;

 }




