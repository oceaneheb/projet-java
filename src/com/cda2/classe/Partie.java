package com.cda2.classe;

public class Partie {
    //Attributs
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    //Constructeurs
    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    //Getters et Setters

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    //Méthodes
    public String lancerPartie() {
        while (this.nbrTour > 0 && this.joueur1.getPointVie() > 0 && this.joueur2.getPointVie() > 0) {
            this.joueur1.attaquer(this.joueur2);
            this.joueur2.attaquer(this.joueur1);
            System.out.println("Joueur1 et Joueur2 ont attaqué");
            System.out.println("Point de vie restant joueur1: "+this.joueur1.getPointVie()+" et joueur2 : "+this.joueur2.getPointVie());

            this.nbrTour --;
            System.out.println("Il reste "+this.nbrTour+" nombre de tours");

//            if (this.joueur1.getPointVie() <= 0) {
//                return "Le joueur 2 a gagné";
//            }
//            if (this.joueur2.getPointVie() <= 0) {
//                return "Le joueur 1 a gagné";
//            }
        }
        if (this.joueur1.getPointVie() <= 0) {
            return "Le joueur 2 a gagné";
        }
        if (this.joueur2.getPointVie() <= 0) {
            return "Le joueur 1 a gagné";
        }
        return "Les 2 joueurs sont à égalité";
    }
}
