package com.gestion.filmotheque.service;

import java.util.List;
import com.gestion.filmotheque.entities.Film;

public interface IServiceFilm {
    Film createFilm(Film f);
    Film findFilmById(int id);
    List<Film> findAllFilms();
    Film updateFilm(Film f);
    void deleteFilm(int id);
}
