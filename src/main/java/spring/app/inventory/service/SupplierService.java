package spring.app.inventory.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.app.inventory.model.dto.SupplierDto;
import spring.app.inventory.model.entity.Supplier;
import spring.app.inventory.repository.SupplierRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;


    public SupplierDto createSupplier(SupplierDto supplierDto) {
        Supplier supplier = convertToEntity(supplierDto);
        Supplier savedSupplier = supplierRepository.save(supplier);
        return convertToDto(savedSupplier);
    }

    //
    public List<SupplierDto> obtenerTodosLosProveedores() {
        List<Supplier> proveedores = supplierRepository.findAll();
        return proveedores.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }


    public SupplierDto obtenerProveedorPorId(Long id) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Proveedor no encontrado"));
        return convertToDto(supplier);
    }


    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }

    // SupplierDto a Supplier
    private Supplier convertToEntity(SupplierDto supplierDto) {
        if (supplierDto == null) {
            return null;
        }
        Supplier supplier = new Supplier();
        supplier.setId(supplierDto.getId());
        supplier.setNombre(supplierDto.getNombre());
        supplier.setContacto(supplierDto.getContacto());
        supplier.setDireccion(supplierDto.getDireccion());
        supplier.setEmail(supplierDto.getEmail());
        supplier.setTelefono(supplierDto.getTelefono());
        return supplier;
    }

    //  Supplier a SupplierDto
    private SupplierDto convertToDto(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return SupplierDto.builder()
                .id(supplier.getId())
                .nombre(supplier.getNombre())
                .contacto(supplier.getContacto())
                .direccion(supplier.getDireccion())
                .email(supplier.getEmail())
                .telefono(supplier.getTelefono())
                .build();
    }
}