package br.com.notas.api.adapter.http.dto;

import br.com.notas.api.adapter.datasource.database.entity.Nota;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    private Long id;

    private String nome;
 
    private String email;

    private List<Nota> notas;

}
