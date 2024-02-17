package br.com.notas.api.adapter.http.dto;

import br.com.notas.api.adapter.datasource.database.entity.Usuario;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotasDTO {

    private Long id;

    private String descricao;

    private LocalDateTime dateCreate;

    private LocalDateTime dataAlerta;

    private Usuario usuario;
}
