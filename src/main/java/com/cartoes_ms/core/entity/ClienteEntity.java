package com.cartoes_ms.core.entity;

import com.cartoes_ms.core.entity.enums.TipoCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", length = 60)
    private String nome;

    @Column(name = "tipo", length = 2)
    private TipoCliente tipo;

    @Column(name = "cpfCnpj", length = 14)
    private String cpfCnpj;

    @Column(name = "endereco", length = 100)
    private String endereco;

    @Column(name = "email", length = 60)
    private String email;
}
