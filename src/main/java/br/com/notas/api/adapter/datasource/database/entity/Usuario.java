package br.com.notas.api.adapter.datasource.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "USUARIO")
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @UuidGenerator
    @Column(name = "ID")
    private UUID id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @OneToMany
    @JoinTable(name = "USUARIO", joinColumns = @JoinColumn(name = "USUARIO_ID"))
    private List<Nota> notas;
}

