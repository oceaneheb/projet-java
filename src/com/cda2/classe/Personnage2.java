package com.cda2.classe;

public class Personnage2 {
    //Attributs
    private String nom;
    private int pointVie;
    private int attaque;
    private int defense;

    //Constructeur
    public Personnage2(String nom, int pointVie, int attaque, int defense) {
        this.nom = nom;
        this.pointVie = pointVie;
        this.attaque = attaque;
        this.defense = defense;
    }

    //Getters et Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointVie() {
        return pointVie;
    }

    public void setPointVie(int pointVie) {
        this.pointVie = pointVie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
