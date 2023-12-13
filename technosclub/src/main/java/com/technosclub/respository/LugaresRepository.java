package com.technosclub.respository;

import com.technosclub.model.Lugares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LugaresRepository extends JpaRepository<Lugares, Long> {

    @Query(value = "SELECT * FROM locaciones WHERE LOWER(nombre) LIKE LOWER(CONCAT('%', :parametro, '%')) OR LOWER(ubicacion) LIKE LOWER(CONCAT('%', :parametro, '%'))", nativeQuery = true)
    List<Lugares> buscarLugaresIgnoreCase(@Param("parametro") String parametro);

}
