import Personnage.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class jeuPersonnage {

    public static void main(String args[]) {

        //Création d'une liste dans laquelle sont stocké les personnages.
        ArrayList<String> nomsjoueur = new ArrayList<>();

        //Attribution des noms pour chaque personnage.
        Scanner rep1 = new Scanner(System.in);
        System.out.println("Nom du premier joueur : ");
        String nom1 = rep1.nextLine();
        nomsjoueur.add(nom1);

        Scanner rep2 = new Scanner(System.in);
        System.out.println("Nom du second joueur : ");
        String nom2 = rep2.nextLine();
        nomsjoueur.add(nom2);

        rep1.close();
        rep2.close();

        //Lister les personnages en jeux.
        System.out.println("Les noms des joueurs sont : ");
        for (String nom : nomsjoueur) {
            System.out.println(" - " + nom);
        }

        //Instanciation des objets j1 (Joueur1) et j2 (Joueur2).
        Personnage j1 = new Personnage(nom1, 100);
        Personnage j2 = new Personnage(nom2, 100);

        //Instanciation de l'objet random.
        Random random = new Random();

        //Boucle dans laquelle on vérifie la vie de chaque personnage avant d'effectuer une attaque.
        while (!j2.estmort() && !j1.estmort()) {

            if (!j1.estmort()) {
                int dgtj1 = random.nextInt(20);
                j1.Attaque(j2, dgtj1);
                System.out.println(j2.LeNom() + " inflige " + dgtj1 + " a son adversaire");
            }

            if (!j2.estmort()) {

                int dgtj2 = random.nextInt(20);
                j2.Attaque(j1, dgtj2);
                System.out.println(j1.LeNom() + " inflige " + dgtj2 + " a son adversaire");
            }
        }

        //Message afficher lors de la mort d'un des personnages.
        if (j1.LaVie() <= 0) {
            System.out.println(j2.LeNom() + " a gagner le combat");
        }

        if (j2.LaVie() <= 0) {
            System.out.println(j1.LeNom() + " a gagner le combat");
        }
    }
}