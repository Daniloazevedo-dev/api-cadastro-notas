package br.com.notas.api.adapter.datasource.database.repository;

import br.com.notas.api.adapter.datasource.database.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findAll();
}
