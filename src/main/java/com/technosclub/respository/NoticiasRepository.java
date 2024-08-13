package com.technosclub.respository;

import com.technosclub.model.Lugares;
import com.technosclub.model.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiasRepository extends JpaRepository<Noticias, Long> {
}
