package com.technosclub.respository;

import com.technosclub.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {


    @Query("SELECT a FROM Artista a WHERE LOWER(a.seudonimo) = LOWER(:parametro) OR LOWER(a.nombre) = LOWER(:parametro)")
    List<Artista> buscarPorSeudonimoIgnoreCase(@Param("parametro") String parametro);

    @Query(value = "SELECT a.id FROM artistas a WHERE LOWER(a.seudonimo) = LOWER(:parametro)", nativeQuery = true)
    Optional<Artista> comprobarSiExiste(@Param("parametro") String parametro);



}
