package com.gestion.filmotheque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion.filmotheque.entities.Categorie;
import com.gestion.filmotheque.repository.CategorieRepository;

@Service
public class ServiceCategorie implements IServiceCategorie {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public Categorie createCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie findCategorieById(int id) {
        return categorieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Categorie> findAllCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void deleteCategorie(int id) {
        categorieRepository.deleteById(id);
    }
}
