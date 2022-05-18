package com.cruznobre.api.core.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "servicos_prestados")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Atendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String description;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @Column(name = "valor_cobrado",
            precision = 19,
            scale = 2)
    private BigDecimal price;

}
