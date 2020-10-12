package com.example.appmobile.model;

import java.util.ArrayList;
import java.util.List;

public class ListEleves {
    static List<Eleve> eleves;

    public ListEleves() {
    }

    public static List<Eleve> getEleves() {
        return eleves;
    }

    public static void addEleve(Eleve eleve) {
        if (eleves == null) {
            eleves = new ArrayList<>();
            eleves.add(eleve);
        } else {
            eleves.add(eleve);
        }
    }

    public static void deleteEleve(String emailEleve) {
        for(Eleve eleve : eleves){
            if(emailEleve.equals(eleve.getEmail())){
                eleves.remove(eleve);
            }
        }
    }

    public static Eleve getByEmail(String email) {
        for(Eleve eleve: getEleves()){
            if(eleve.getEmail().equals(email)){
                return eleve;
            }
        }
        return null;
    }

    public static void updateEleve(Eleve eleve){
        Eleve eleveToUpdate = getByEmail(eleve.getEmail());
        eleves.remove(eleveToUpdate);
        eleves.add(eleve);
    }

    public static List<Eleve> findAllEleves() {


        return eleves;
    }
}
