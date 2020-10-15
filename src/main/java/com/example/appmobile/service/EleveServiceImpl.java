package com.example.appmobile.service;

import com.example.appmobile.model.Eleve;
import com.example.appmobile.model.ListEleves;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleveServiceImpl implements EleveService {


    @Override
    public Eleve createEleve(Eleve eleve) {
        ListEleves.addEleve(eleve);
        return eleve;
    }

    @Override
    public Eleve findEleve(String email) {
        return ListEleves.getByEmail(email);
    }

    @Override
    public Eleve deleteEleve(String email) {
        ListEleves.deleteEleve(email);
        return ListEleves.getByEmail(email);
    }

    @Override
    public Eleve updateEleve(Eleve eleve) {
        ListEleves.updateEleve(eleve);
        return eleve;
    }

    @Override
    public List<Eleve> findAllEleves() {
        return ListEleves.findAllEleves();
    }
}
