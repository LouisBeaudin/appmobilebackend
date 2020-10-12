package com.example.appmobile.service;

import com.example.appmobile.model.Eleve;

import java.util.List;

public interface EleveService {
    void createEleve(Eleve eleve);

    Eleve findEleve(String email);

    void deleteEleve(String email);

    void updateEleve(Eleve eleve);

    List<Eleve> findAllEleves();
}
