import com.cda2.classe.Habitation;
import com.cda2.classe.Utilisateur;
import com.cda2.classe.Vehicule;

public class Demarrage {
    public static void main(String[] args) {
        Utilisateur oceane = new Utilisateur("Océane", "Hebrard", "oceane.heb@gmail.com", "1234");
        System.out.println(oceane.toString());
        // oceane.nom = "test"; -> uniquement si l'attribut est en public dans la Classe Utilisateur
        oceane.setNom("test"); //modifier le nom

        //Instancier plusieurs objets de la Classe Habitation
        Habitation maison = new Habitation("Belle Vue", 12, 5, 1);
        Habitation gite = new Habitation("Le beau Gîte", 4, 2.5, 2);
        Habitation appartement = new Habitation("Les Cygognes", 6, 4, 3);

        //Appeler la méthode surface() sur les 3 objets instanciers
        System.out.println("L'habitation " + maison.getNom() + " à une surface de : " + maison.surface() + " m2");
        System.out.println("L'habitation " + gite.getNom() + " à une surface de : " + gite.surface() + " m2");
        System.out.println("L'habitation " + appartement.getNom() + " à une surface de : " + appartement.surface() + " m2");

        // ---------- Exercice 27 POO --------------
        Vehicule voiture = new Vehicule("Renautl", 4, 90);
        Vehicule moto = new Vehicule("Citroen", 2, 60);
        System.out.println(voiture.detect());
        System.out.println(moto.detect());
        voiture.boost();
        System.out.println("La nouvelle vitesse de "+voiture.getNom()+ " est de "+ voiture.getVitesse()+" km/h");
        //Exercice 28 -> méthode plusRapide()
        System.out.println(voiture.plusRapide(moto));
        System.out.println(moto.plusRapide(voiture));
    }
}
