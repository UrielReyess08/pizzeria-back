package com.bar.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    private String name;
    private String last_name;
    @Column(unique = true,nullable = false)
    private String email;


    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonIgnore
    private List<Venta> ventaList= new ArrayList<>();
}

