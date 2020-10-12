package com.example.appmobile.model;

public class Eleve {
    private String name;
    private String lastName;
    private String email;
    private int age;
    private boolean redoublant;
    private String sexe;
    private String classe;

    public Eleve() {
    }

    public Eleve(String name, String lastName, String email, int age, boolean redoublant, String sexe, String classe) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.redoublant = redoublant;
        this.sexe = sexe;
        this.classe = classe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRedoublant() {
        return redoublant;
    }

    public void setRedoublant(boolean redoublant) {
        this.redoublant = redoublant;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
