package spring.app.inventory.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "inventarios")
    public class Inventory {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @ManyToOne
        @JoinColumn(name = "producto_id", nullable = false)
        private Products producto;

        @Column(nullable = false)
        private int cantidad;

        @Column(nullable = false)
        private LocalDate fechaIngreso;

        @Column(nullable = true)
        private LocalDate fechaSalida;
    }
