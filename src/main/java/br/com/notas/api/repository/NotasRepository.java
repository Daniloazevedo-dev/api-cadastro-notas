package br.com.notas.api.repository;

import br.com.notas.api.datasource.database.entity.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotasRepository extends JpaRepository<Notas, Long> {

    List<Notas> findAll();
}
