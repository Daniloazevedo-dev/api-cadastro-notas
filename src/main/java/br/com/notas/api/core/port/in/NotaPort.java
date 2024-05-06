package br.com.notas.api.core.port.in;

import br.com.notas.api.adapter.datasource.database.entity.Nota;

public interface NotaPort {

    Nota cadastrar(Nota nota);

    Nota buscar(Long id);

    Nota atualizar(Nota nota);

    void deletar(Long id);
}
