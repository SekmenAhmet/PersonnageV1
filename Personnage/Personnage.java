package Personnage;

public class Personnage {
    private String Nom;
    private int Vie;

    //Constructeur de la classe personnage qui permet l'attribution des valeurs des variables Nom et Vie.
    public Personnage(String Nom, int Vie) {
        this.Nom = Nom;
        this.Vie = Vie;
    }

    //Accesseur de la vie du personnage.
    public int LaVie() {
        return this.Vie;
    }

    //Accesseur du nom du personnage
    public String LeNom() {
        return this.Nom;
    }

    //Augmentation de la vie des personnages (non utiliser dans le programme principal).
    public void AugmenterVie(int pv) {
        this.Vie = Vie + pv;
    }

    //Fonction d'attaque des personnages qui prend en compte le personnage cible et les dégâts effectués.
    public void Attaque(Personnage cible, int dgt ) {
        cible.Vie = cible.Vie - dgt;
    }

    //Fonction qui determine si le personnage est mort ou non en se basant sur ses points de vies
    public boolean estmort() {
        return this.Vie <= 0;
    }
}