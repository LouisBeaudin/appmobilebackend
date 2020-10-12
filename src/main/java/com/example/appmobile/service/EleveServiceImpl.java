package com.example.appmobile.service;

import com.example.appmobile.model.Eleve;
import com.example.appmobile.model.ListEleves;
import org.springframework.stereotype.Service;

@Service
public class EleveServiceImpl implements EleveService{


    @Override
    public void createEleve(Eleve eleve) {
        ListEleves.addEleve(eleve);
    }

    @Override
    public Eleve findEleve(String email) {
        return ListEleves.getByEmail(email);
    }

    @Override
    public void deleteEleve(String email) {
        ListEleves.deleteEleve(email);
    }

    @Override
    public void updateEleve(Eleve eleve) {
        ListEleves.updateEleve(eleve);
    }
}
