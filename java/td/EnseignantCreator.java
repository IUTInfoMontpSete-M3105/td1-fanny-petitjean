package td;

import java.util.ArrayList;

/**
 * 
 */
public class EnseignantCreator extends UtilisateurCreator {
    public void setNumem(String numem) {
        this.numem = numem;
    }

    public void setHarpege(String harpege) {
        this.harpege = harpege;
    }

    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }

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


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Enseignant createEnseignant() {
        return new Enseignant(nom, prenom, adresse, mail, numem, harpege, cours);
    }


}