package com.cda2.classe;

public class Guerrier extends Personnage {
    private int bonusDefense;

    //Constructeur
    public Guerrier(String nom, int pointVie, int attaque, int defense, int bonusDefense) {
        super(nom, pointVie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    //Getter et setter
    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    public void attaquer(Personnage cible) {
        int rand = (int) (Math.random() * 20) + 1;
        System.out.println(rand);
        if (rand == 1) {
            int blessure = cible.getPointVie() - super.getAttaque() + cible.getDefense();
            cible.setPointVie(blessure);
            super.setPointVie(super.getPointVie() + 3);
        } else {
            int blessure = cible.getPointVie() - super.getAttaque() + cible.getDefense();
            cible.setPointVie(blessure);
        }
    }
}
