package com.example.test.medicalert;

public class Patient {
    public static final String emailKey = "email";
    public static final String passwordKey = "password";
    public static final String prenomKey = "prenom";
    public static final String nomKey = "nom";
    public static final String dateNaissanceKey = "date_naissance";
    public static final String idAideSoignantKey = "id_aide_soignant";
    private String email;
    private String password;
    private String prenom;
    private String nom;
    private String dateNaissance;
    private int idAideSoignant;

    public Patient(String email, String password, String prenom, String nom, String dateNaissance, int idAideSoignant){
        this.email = email;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.idAideSoignant = idAideSoignant;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public int getIdAideSoignant() { return idAideSoignant;}
}

