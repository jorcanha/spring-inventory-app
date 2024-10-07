package spring.app.inventory.model.entity;

import jakarta.persistence.*;
import lombok.Data;


 @Data
 @Entity
 @Table(name = "proveedor_producto")
 public class ProveedorProducto {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

     private String nombre;

     @ManyToOne
     @JoinColumn(name = "proveedor_id", nullable = false)
     private Proveedor proveedor; // Relación con Proveedor

     @ManyToOne
     @JoinColumn(name = "producto_id", nullable = false)
     private Productos producto; // Relación con Producto

     private Double precioProveedor;

 }




