package com.bar.demo.Controller;

import com.bar.demo.Controller.dto.ProductDTO;
import com.bar.demo.entity.Product;
import com.bar.demo.persistence.IProductDAO;
import com.bar.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductService productService;


    @GetMapping("/find/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id) {
        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isPresent()) {
            Product product = productOptional.get();
            ProductDTO productDTO = ProductDTO.builder()
                    .id(product.getId())
                    .code(product.getCode())
                    .name(product.getName())
                    .price(product.getPrice())
                    .stock(product.getStock())

                    .detalleVentaList(product.getDetalleVentaList())
                    .build();
            return ResponseEntity.ok(productDTO);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<ProductDTO> productList = productService.findAll()
        .stream()
                .map(product -> ProductDTO.builder()
                .id(product.getId())
                                .code(product.getCode())
                .name(product.getName())
                        .price(product.getPrice())
                                .stock(product.getStock())
                                .detalleVentaList(product.getDetalleVentaList())
                                .build()
                ).toList();
        return ResponseEntity.ok(productList);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProductDTO productDTO) throws URISyntaxException {
        if(productDTO.getName().isBlank() || productDTO.getPrice() ==null || productDTO.getStock() == null){
    return ResponseEntity.badRequest().build();
        }
        Product product = Product.builder()
                .code(productDTO.getCode())
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .stock(productDTO.getStock())
                .detalleVentaList(productDTO.getDetalleVentaList())
                .build();

        productService.save(product);
        return ResponseEntity.created(new URI("/api/product/save")).build();

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable Long id, @RequestBody ProductDTO productDTO) {

        Optional<Product> productOptional = productService.findById(id);

        if(productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setName(productDTO.getName());
            product.setName(productDTO.getName());
            product.setPrice(productDTO.getPrice());
            product.setStock(productDTO.getStock());

            productService.save(product);
            return ResponseEntity.ok("Registro Actualizado");
        }
            return ResponseEntity.notFound().build();

        }

@DeleteMapping("/delete/{id}")


        public ResponseEntity<?> deleteById(@PathVariable Long id){

            if(id != null){
                productService.deleteById(id);
                return ResponseEntity.ok("Registro eliminado");
            }
            return ResponseEntity.badRequest().build();
        }

    }


