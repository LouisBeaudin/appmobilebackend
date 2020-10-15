package com.example.appmobile.service;

import com.example.appmobile.model.Eleve;

import java.util.List;

public interface EleveService {
    Eleve createEleve(Eleve eleve);

    Eleve findEleve(String email);

    Eleve deleteEleve(String email);

    Eleve updateEleve(Eleve eleve);

    List<Eleve> findAllEleves();
}
