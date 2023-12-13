package com.technosclub.respository;

import com.technosclub.model.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface    EntidadRepository extends JpaRepository<Entidad, Long> {

    @Query(value = "SELECT * FROM entidades WHERE LOWER(nombre) LIKE LOWER(CONCAT('%', :parametro, '%'))", nativeQuery = true)
    List<Entidad> buscarPorNombreIgnoreCase(@Param("parametro") String parametro);

}
