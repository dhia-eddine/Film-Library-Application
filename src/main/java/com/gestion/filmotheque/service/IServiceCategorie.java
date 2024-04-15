package com.gestion.filmotheque.service;

import java.util.List;
import com.gestion.filmotheque.entities.Categorie;

public interface IServiceCategorie {
    Categorie createCategorie(Categorie categorie);
    Categorie findCategorieById(int id);
    List<Categorie> findAllCategories();
    Categorie updateCategorie(Categorie categorie);
    void deleteCategorie(int id);
}
