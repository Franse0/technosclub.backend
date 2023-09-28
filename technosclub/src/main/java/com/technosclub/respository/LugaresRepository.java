package com.technosclub.respository;

import com.technosclub.model.Lugares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugaresRepository extends JpaRepository<Lugares, Long> {
}
