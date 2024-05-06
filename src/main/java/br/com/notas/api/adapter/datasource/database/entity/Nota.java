package br.com.notas.api.adapter.datasource.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "NOTA")
@EqualsAndHashCode(of = "id")
public class Nota {

    @Id
    @UuidGenerator
    @Column(name = "ID")
    private UUID id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @CreationTimestamp
    @Column(name = "DATE_CREATE", updatable = false)
    private LocalDateTime dateCreate;

    @Column(name = "DATA_ALERTA")
    private LocalDateTime dataAlerta;

    @ManyToOne
    private Usuario usuario;

}
