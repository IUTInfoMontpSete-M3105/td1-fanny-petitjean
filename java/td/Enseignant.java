package td;

import java.util.ArrayList;

public class Enseignant {

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

    public Enseignant(String nom, String prenom, String adresse,String mail,String numem,String harpege,ArrayList<Cours> cours) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.adresse=adresse;
        this.harpege=harpege;
        this.numem=numem;
        this.mail=mail;
        this.cours=cours;
    }
}
