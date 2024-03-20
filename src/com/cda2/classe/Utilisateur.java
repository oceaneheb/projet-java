package com.cda2.classe;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private String password;

    //Constructeur
    public Utilisateur() {};

    public Utilisateur(String nom , String prenom, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    //getters et setters
    //Générer automatiquement avec clic Droit + Generate + Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //méthode
    public String toString() {
        return this.nom + " " + this.prenom;
    }

}
