package com.bar.demo.Controller;

import com.bar.demo.Controller.dto.ClientDTO;
import com.bar.demo.Controller.dto.VentaDTO;
import com.bar.demo.entity.Client;
import com.bar.demo.entity.Venta;
import com.bar.demo.service.IClientService;
import com.bar.demo.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "api/v1/clients")

public class ClientController {



    @Autowired
    private IClientService clientService;



    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Client> clientOptional=clientService.findById(id);
        if(clientOptional.isPresent()){
            Client client = clientOptional.get();

            ClientDTO clientDTO = ClientDTO.builder()
                    .id(client.getId())
                    .name(client.getName())
                    .last_name(client.getLast_name())
                    .email(client.getEmail())
                    .ventaList(client.getVentaList())
                    .build();
            return ResponseEntity.ok(clientDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){

        List<ClientDTO> clientList = clientService.findAll()
                .stream()
                .map(client -> ClientDTO.builder()
                        .id(client.getId())
                        .name(client.getName())
                        .last_name(client.getLast_name())
                        .email(client.getEmail())
                        .ventaList(client.getVentaList())
                        .build())
                .toList();
        return ResponseEntity.ok(clientList);
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ClientDTO clientDTO) throws URISyntaxException {



        Client client = Client.builder()
                .name(clientDTO.getName())
                .last_name(clientDTO.getLast_name())
                .email(clientDTO.getEmail())
                .ventaList(clientDTO.getVentaList()) // Si es necesario
                .build();

        // Guardar la venta
        clientService.save(client);

        // Devolver respuesta de éxito
        return ResponseEntity.status(HttpStatus.CREATED).body("Venta guardada exitosamente.");

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?>updateClient(@PathVariable Long id,@RequestBody ClientDTO clientDTO){

        Optional<Client> clientOptional = clientService.findById(id);
        if(clientOptional.isPresent()){
            Client client = clientOptional.get();
            client.setName(clientDTO.getName());
            client.setLast_name(clientDTO.getLast_name());
            client.setEmail(clientDTO.getEmail());
            clientService.save(client);
            return ResponseEntity.ok("Registro Actualizado");
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBy(@PathVariable Long id){
        if(id != null){
            clientService.deleteById(id);
            return ResponseEntity.ok("Registro eliminado");
        }
        return ResponseEntity.badRequest().build();
    }
}
