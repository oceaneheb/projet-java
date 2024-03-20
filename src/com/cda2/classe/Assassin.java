package com.cda2.classe;

public class Assassin extends Personnage {
    private int bonusAttaque;

    //Constructeur qui hérite du constructeur de la classe parent Personnage
    public Assassin(String nom, int pointVie, int attaque, int defense, int bonusAttaque) {
        super(nom, pointVie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    //Getter et Setter de l'attribut ajouté
    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    public void attaquer(Personnage cible) {
        int rand = (int) (Math.random() *20 ) + 1;
        System.out.println(rand);
        if (rand == 1) {
            int blessure = cible.getPointVie() - (super.getAttaque() + this.bonusAttaque) + cible.getDefense();
            cible.setPointVie(blessure);
        } else {
            int blessure = cible.getPointVie() - super.getAttaque() + cible.getDefense();
            cible.setPointVie(blessure);
        }
    }
}
