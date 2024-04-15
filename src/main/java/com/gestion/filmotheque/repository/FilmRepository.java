package com.gestion.filmotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestion.filmotheque.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
