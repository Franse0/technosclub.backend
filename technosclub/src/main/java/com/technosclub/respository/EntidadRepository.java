package com.technosclub.respository;

import com.technosclub.model.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Long> {
}
