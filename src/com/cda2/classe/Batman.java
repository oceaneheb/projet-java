package com.cda2.classe;

public class Batman extends Personnage2 implements Competence {

    public Batman(String nom, int pointVie, int attaque, int defense)
    {
        super(nom, pointVie, attaque, defense);
    }
    public void attaquer(Personnage object) {
        if(this.getAttaque()-object.getDefense() > 0) {
            object.setPointVie(this.getAttaque()-object.getDefense());
        }
    }
}
