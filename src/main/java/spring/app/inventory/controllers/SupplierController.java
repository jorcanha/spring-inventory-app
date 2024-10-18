package spring.app.inventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.app.inventory.model.dto.SupplierDto;
import spring.app.inventory.service.SupplierService;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping
    public ResponseEntity<SupplierDto> createSupplier(@RequestBody SupplierDto supplierDto) {
        try {
            SupplierDto nuevoSupplierDto = supplierService.createSupplier(supplierDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoSupplierDto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<SupplierDto>> obtenerTodosLosProveedores() {
        List<SupplierDto> proveedoresDto = supplierService.obtenerTodosLosProveedores();
        return ResponseEntity.ok(proveedoresDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupplierDto> obtenerProveedorPorId(@PathVariable Long id) {
        SupplierDto supplierDto = supplierService.obtenerProveedorPorId(id);
        return ResponseEntity.ok(supplierDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupplier(@PathVariable Long id) {
        supplierService.deleteSupplier(id);
        return ResponseEntity.noContent().build();
    }
}