package com.technosclub.respository;

import com.technosclub.model.Fiesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FiestaRepository extends JpaRepository<Fiesta, Long> {
    @Query(value = "SELECT * FROM fiestas WHERE LOWER(organiza) LIKE LOWER(CONCAT('%', :parametro, '%')) OR LOWER(ubicacion) LIKE LOWER(CONCAT('%', :parametro, '%'))", nativeQuery = true)
//    @Query("SELECT a FROM Fiesta a WHERE  LOWER(a.organiza) = LOWER(:parametro) OR LOWER(a.ubicacion) = LOWER(:parametro)")
    List<Fiesta>buscarFiestaIgnoreCase(@Param("parametro")String parametro);

}
