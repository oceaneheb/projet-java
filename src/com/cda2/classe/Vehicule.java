package com.cda2.classe;

public class Vehicule {

    //si on ne précise pas public ou private alors cela devient package
    private String nom;
    private int nbrRoue;
    private int vitesse;

    public Vehicule() {};

    //Constructeur
    public Vehicule(String nom, int nbrRoue, int vitesse) {
        this.nom = nom;
        this.nbrRoue = nbrRoue;
        this.vitesse = vitesse;
    }

    //Getter et setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //Méthodes
    public void boost() {
        this.vitesse += 50;
    }

    public String detect() {
        if (this.nbrRoue == 2) {
            return "Le véhicule est une moto";
        } else if (this.nbrRoue == 4) {
            return "Le véhicule est une voiture";
        } else {
            return "Le véhicule est autre chose";
        }
    }

    public String plusRapide(Vehicule vehicule) {
        if (this.vitesse > vehicule.getVitesse()) {
            return "Le véhicule le plus rapide est "+this.getNom();
        } else {
            return "Le véhicule le plus rapide est "+vehicule.getNom();
        }
    }
}
