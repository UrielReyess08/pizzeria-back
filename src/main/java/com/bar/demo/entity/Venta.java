package com.bar.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Double total;
    private int estado;


    ///////////////



    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<DetalleVenta> detalleVentaList = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name="id_client", nullable = false)
    @JsonIgnore
    private Client client;

    //Fecha actual
    @PrePersist
    protected void onCreate() {
        this.fecha = new Date();
    }
}
