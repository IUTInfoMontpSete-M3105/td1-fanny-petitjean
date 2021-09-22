package td1;

import java.util.ArrayList;

public class Enseignant extends Utilisateur {

    /**
     *
     */
    private String numem;

    /**
     *
     */
    private String harpege;

    private ArrayList<Cours> cours;


    /**
     *
     */
    private String nom;

    /**
     *
     */
    private String prenom;

    /**
     *
     */
    private String adresse;

    /**
     *
     */
    private String mail;

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }

    public Enseignant(String nom, String prenom, String adresse, String mail, String numem, String harpege) {
        super(nom,prenom,adresse,mail);
        this.harpege=harpege;
        this.numem=numem;
    }
}
