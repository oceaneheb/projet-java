import com.cda2.classe.Assassin;
import com.cda2.classe.Guerrier;
import com.cda2.classe.Partie;
import com.cda2.classe.Personnage;

public class JeuAttaque {
    public static void main(String[] args) {
        Personnage joueur1 = new Personnage("Luc", 20, 3, 2);
        Personnage joueur2 = new Personnage("Paul", 20, 4, 1);
        joueur1.attaquer(joueur2);
        //System.out.println("Point de vie restant joueur1 : "+joueur1.getPointVie()+" et joueur2 : "+joueur2.getPointVie());

        //Tester la class Assasin avec la méthode attaquer()
        Assassin assassin1 = new Assassin("Philippe", 25, 3, 2, 2);
        assassin1.attaquer(joueur1);
        //System.out.println("Point de vie restant joueur1 : "+joueur1.getPointVie());

        //Tester la class Guerrier avec la méthode Attaquer()
        Guerrier guerrier1 = new Guerrier("Laurent", 20, 4, 1, 2);
        guerrier1.attaquer(joueur1);
        //System.out.println("Point de vie restant de guerrier1 : "+guerrier1.getPointVie());

        //Tester une partie de jeu
        Partie partieJeu = new Partie(guerrier1, assassin1, 10);
        System.out.println(partieJeu.lancerPartie());
    }
}
