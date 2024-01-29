package br.com.notas.api.datasource.database.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "NOTAS")
@EqualsAndHashCode(of = "id")
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notas_sequence")
    @SequenceGenerator(name = "notas_sequence", sequenceName = "notas_seq", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

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
