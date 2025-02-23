package com.bar.demo.Controller;

import com.bar.demo.Controller.dto.VentaDTO;
import com.bar.demo.entity.Venta;
import com.bar.demo.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/venta")
public class VentaController {

    @Autowired
    private IVentaService ventaService;



    @GetMapping("/find/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){
        Optional<Venta> ventaOptional=ventaService.findById(id);
    if(ventaOptional.isPresent()){
        Venta venta = ventaOptional.get();

        VentaDTO ventaDTO = VentaDTO.builder()
                .id(venta.getId())
                .numero_venta(venta.getNumero_venta())
                .fecha(venta.getFecha())
                .total(venta.getTotal())
                .estado(venta.getEstado())
                .client(venta.getClient())
                .detalleVentaList(venta.getDetalleVentaList())
                .build();
        return ResponseEntity.ok(ventaDTO);
        }
    return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){

    List<VentaDTO> ventaList = ventaService.findAll()
        .stream()
        .map(venta -> VentaDTO.builder()
                .id(venta.getId())
                .numero_venta(venta.getNumero_venta())
                .fecha(venta.getFecha())
                .total(venta.getTotal())
                .estado(venta.getEstado())
                .client(venta.getClient())
                .detalleVentaList(venta.getDetalleVentaList())
                .build())
        .toList();
    return ResponseEntity.ok(ventaList);
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody VentaDTO ventaDTO) throws URISyntaxException {

       /* if (ventaDTO.getTotal() == null) {
            return ResponseEntity.badRequest().body("Fecha y total son obligatorios.");
        }*/

        Venta venta = Venta.builder()
                .numero_venta(ventaDTO.getNumero_venta())
                .fecha(ventaDTO.getFecha())
                .total(ventaDTO.getTotal())
                .estado(ventaDTO.getEstado())
                .client(ventaDTO.getClient())
                .detalleVentaList(ventaDTO.getDetalleVentaList()) // Si es necesario
                .build();

        // Guardar la venta
        ventaService.save(venta);

        // Devolver respuesta de éxito
        return ResponseEntity.status(HttpStatus.CREATED).body("Venta guardada exitosamente.");

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?>updateVenta(@PathVariable Long id,@RequestBody VentaDTO ventaDTO){

        Optional<Venta> ventaOptional = ventaService.findById(id);
        if(ventaOptional.isPresent()){
            Venta venta = ventaOptional.get();
            venta.setNumero_venta(ventaDTO.getNumero_venta());
            venta.setFecha(ventaDTO.getFecha());
            venta.setTotal(ventaDTO.getTotal());
            venta.setEstado(ventaDTO.getEstado());
            venta.setClient(ventaDTO.getClient());
            ventaService.save(venta);
            return ResponseEntity.ok("Registro Actualizado");
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBy(@PathVariable Long id){
        if(id != null){
            ventaService.deleteById(id);
            return ResponseEntity.ok("Registro eliminado");
        }
        return ResponseEntity.badRequest().build();
    }
}
