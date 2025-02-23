package com.bar.demo.Controller.dto;

import com.bar.demo.entity.Venta;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDTO {

    private Long    id;
    private String name;
    private String last_name;
    private String email;

    private List<Venta> ventaList= new ArrayList<>();
}
