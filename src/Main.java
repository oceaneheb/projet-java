import com.cda2.classe.Utilisateur;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* System.out.println("Hello World");
        int nbr = 10;
        boolean etat = true;
        double longnrb = 10.52;
        int nbr2 = 20;
        String chaine = "ma chaine";
        nbr = 52;
        Ceci est un commentaire */

        /* System.out.println("Le résultat est égal à " + addition(10, 25));
        System.out.println(soustraction(5, 2, -3));
        System.out.println(moyenne(5, 3, 10, 9));
        System.out.println(intervertir(5, 2)); */
        /* lecture();
        carre(); */
        //add();

        //Scanner scanner = new Scanner(System.in);
        // System.out.println("La moyenne est égale à " + moyenneV2(scanner));
        //System.out.println("Le prix TTC est égal à " + prixTTC(scanner) + " €");
        //categoryChildren();
        //produit();
        //produitV2();
        //afficherHeure();
        //afficherHeureV2();
        //System.out.println(trouverNombre());
        //System.out.println(trouverNombreV2());
        //afficherDixNombresSuivants();
        //tableDeMultiplication();
        //System.out.println(sommeDesEntiers());
        //valeurMaxiMini();
        //System.out.println(moyenne());
        //moyenneV2();
        //System.out.println("La moyenne des notes est de " + moyenneV2());
        //valeursNegativePositive();
        //System.out.println("La valeur absolue la plus petite est " + valeurAbsolue());

    }

    public static int addition(int nbr1, int nbr2) {
        return nbr1 + nbr2;
    }

    public static int soustraction(int i, int j, int k) {
        return i - j - k;
    }

    public static double moyenne(int nbr1, int nbr2, int nbr3, int nbr4) {
        double somme = nbr1 + nbr2 + nbr3 + nbr4;
        return somme / 4;
    }

    public static String intervertir(int i, int j) {
        return "i = " + j + " j = " + i;
    }

    //Fonction pour demander à l'utilisateur de rentrer un nombre dans la console, récupérer ce nombre et l'afficher
    public static void lecture() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        //récupérer le nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Vous avez saisi : " + nbr);
    }

    public static void carre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int nbr = scanner.nextInt();
        System.out.println("Le carré de " + nbr + " est égal à " + nbr * nbr);
    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un deuxième nombre");
        int nbr2 = scanner.nextInt();
        System.out.println("La somme de " + nbr1 + " et " + nbr2 + " est égal à " + (nbr1 + nbr2));
    }

    public static double lectureV2(Scanner scanner, String msg) {
        System.out.println(msg);
        double nbr = scanner.nextDouble();
        return nbr;
    }

    public static double moyenneV2(Scanner scanner) {
        double nbr1 = lectureV2(scanner, "Veuillez saisir un 1er nombre");
        double nbr2 = lectureV2(scanner, "Veuillez saisir un 2ème nombre");
        double nbr3 = lectureV2(scanner, "Veuillez saisir un 3ème nombre");
        return (nbr1+nbr2+nbr3)/3;
    }

    //Exercice 7
    public static double prixTTC(Scanner scanner) {
        double prixHT = lectureV2(scanner, "Prix HT de l'article : ");
        double quantite = lectureV2(scanner, "Quantité d'articles :");
        double tauxTVA = lectureV2(scanner, "Quel est le taux de TVA ?");
        return Math.round((prixHT * (tauxTVA/100)) + prixHT) * quantite;
    }

    //Exercice 8
    public static void produit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un second nombre");
        int nbr2 = scanner.nextInt();
        if (nbr1 > 0 && nbr2 > 0) {
            System.out.println("Le produit des 2 nombres est positif");
        } else if (nbr1 < 0 && nbr2 < 0 ) {
            System.out.println("Le produit des 2 nombres est positif");
        } else if (nbr1 > 0 && nbr2 < 0) {
            System.out.println("Le produit des 2 nombres est négatif");
        } else {
            System.out.println("Le produit des 2 nombres est négatif");
        }
    }

    //Exercice 9
    public static void produitV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un second nombre");
        int nbr2 = scanner.nextInt();
        if (nbr1 > 0 && nbr2 > 0) {
            System.out.println("Le produit des 2 nombres est positif");
        } else if (nbr1 < 0 && nbr2 < 0 ) {
            System.out.println("Le produit des 2 nombres est positif");
        } else if (nbr1 > 0 && nbr2 < 0) {
            System.out.println("Le produit des 2 nombres est négatif");
        } else if (nbr1 < 0 && nbr2 > 0){
            System.out.println("Le produit des 2 nombres est négatif");
        } else {
            System.out.println("Le produit des 2 nombres est null");
        }
    }

    //Exercice 10
    public static String categoryChildren() {
        Scanner scanner = new Scanner(System.in);
        //Poser une question dans la console
        System.out.println("Quel est votre âge ?");
        //Récupérer la valeur écrite par l'utilisateur dans la console
        int age = scanner.nextInt();
//        String resultat = "";
        if (age>=6 && age<=7) {
            return "Poussin";
        } else if (age>=8 && age<=9) {
            return "Pupille";
        } else if (age>=10 && age<=11) {
            return "Minime";
        } else if (age>=12) {
            return"Cadet";
        } else {
            return "Trop jeune";
        }
    }

    //Exercice 11
    public static void afficherHeure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'heure :");
        int heure = scanner.nextInt();
        System.out.println("Entrez les minutes :");
        int minute = scanner.nextInt();
        if (minute == 59 && heure != 23) {
            System.out.println("Dans une minute, il sera " + (heure + 1) + " heures 00");
        } else if (heure == 23 && minute == 59) {
            System.out.println("Dans une minute, il sera minuit");
        } else {
            System.out.println("Dans une minute, il sera " + heure + " heures " + (minute + 1));
        }
    }

    //Exercice 12
    public static void afficherHeureV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'heure :");
        int heure = scanner.nextInt();
        System.out.println("Entrez les minutes :");
        int minute = scanner.nextInt();
        System.out.println("Entrez les secondes :");
        int seconde = scanner.nextInt();
        if (seconde == 59 && minute != 59 && heure != 23) {
            System.out.println("Dans une seconde, il sera " + heure + " heures " + (minute+1) + " minutes et 0 secondes");
        } else if (seconde == 59 && minute == 59 && heure != 23){
            System.out.println("Dans une seconde, il sera " + (heure + 1) + " heures, 0 minutes et 0 secondes");
        } else if (seconde == 59 && minute == 59 && heure == 23) {
            System.out.println("Dans une seconde, il sera minuit");
        } else {
            System.out.println("Dans une seconde, il sera " + heure + " heures " + minute + " minutes et " + (seconde+1) + " secondes");
        }
    }

    //Exercice 14
    public static String trouverNombre() {
        Scanner scanner = new Scanner(System.in);
        int rand = (int) (Math.random() * 3) + 1;
        System.out.println(rand);
        int response = 0;
        System.out.println("Veuillez saisir un nombre entre 1 et 3");
        response = scanner.nextInt();
        while (response != rand) {
            System.out.println("Veuillez essayer de nouveau :");
            response = scanner.nextInt();
        }
        return "Bravo vous avez la bonne réponse";
    }

    //Exercice 15
    public static String trouverNombreV2() {
        Scanner scanner = new Scanner(System.in);
        int rand = (int) (Math.random() * 11) + 10;
        System.out.println(rand);
        int response = 0;
        System.out.println("Veuillez saisir un nombre entre 10 et 20");
        response = scanner.nextInt();
        while (response != rand) {
            if (response > 20) {
                System.out.println("Le nombre est trop grand");
            }
            if (response < 10) {
                System.out.println("Le nombre est trop petit");
            }
            System.out.println("Veuillez essayer de nouveau :");
            response = scanner.nextInt();
        }
        return "Bravo vous avez la bonne réponse";
    }

    //Exercice 16 (Bonus)
    public static void afficherDixNombresSuivants() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        for (int i=nbr; i<nbr+10; i++) {
            System.out.println(i);
        }
    }

    //Exercice 17 (Bonus)
    public static void tableDeMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        for (int i=1; i<11; i++ ) {
            System.out.println(nbr + " x " + i + " = " + (nbr * i));
        }
    }

    //Exercice 18 (Bonus)
    public static int sommeDesEntiers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        int nbr = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<nbr+1; i++) {
            sum += i;
        }
        return sum;
    }

    //Exercice 19
    public static void valeurMaxiMini() {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        int array[] = {10,33,56,89,7,11,2,16};

        for (int i=0; i<array.length; i++) {
            if (array[i] < maxValue) {
                maxValue = array[i];
            }
            if (array[i] > minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Valeur minimale : " + maxValue);
        System.out.println("Valeur maximale : " + minValue);
    }

    //Exercice 20
    public static int moyenne() {
        int array[] = {10,33,56,89,7,11,2,16};
        int sum = 0;

        for (int nombre:array) {
            sum += nombre;
        }

        return sum/array.length;
    }

    //Exercice 22
    public static int moyenneV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Souhaitez-vous ajouter une note ? (oui/non)");
        String response = scanner.nextLine();
        System.out.println(response);
        ArrayList<Integer> myNotes = new ArrayList<Integer>();
        System.out.println("Mon tableau " + myNotes);
        while (response.equals("oui")) {
            System.out.println("Veuillez entrer une note");
            int note = scanner.nextInt();
            myNotes.add(note);

            System.out.println("Souhaitez-vous ajouter une nouvelle note ? (oui/non)");
            scanner.nextLine(); //Consomme la nouvelle ligne
            response = scanner.nextLine();
        }
        int sum = 0;
        for (int note:myNotes) {
            sum += note;
        }
        return sum/myNotes.size();
    }

    //Exercice 23
    public static void valeursNegativePositive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de valeurs souhaitez-vous stocker ?");
        int nombreValeurs = scanner.nextInt();
        ArrayList<Integer> myValues = new ArrayList<Integer>();
        for (int i=nombreValeurs; i>0; i--) {
            System.out.println("Entrez une valeur");
            int valeur = scanner.nextInt();
            myValues.add(valeur);
        }
        int nbrNeg = 0;
        int nbrPos = 0;
        for (int value:myValues) {
            if (value < 0) {
                nbrNeg++;
            } else {
                nbrPos++;
            }
        }
        System.out.println("Il y a " + nbrNeg + " valeur(s) négative(s) et " + nbrPos + " valeur(s) positive(s).");
    }

    //Exercice 24 (Bonus)
    public static int valeurAbsolue() {
        int tab[] = {2,18,-5, 12, 36, -1, 14};
        ArrayList<Integer> myNewTab = new ArrayList<Integer>();

        for (int valeur:tab) {
            myNewTab.add(Math.abs(valeur));
        }
        System.out.println(myNewTab);

        int minValue = myNewTab.get(0);
        for (int valeur:myNewTab) {
            if (valeur < minValue) {
                minValue = valeur;
            }
        }
        return minValue;
    }
}
