package td;

public class Administrateur extends Utilisateur {

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

    /**
     * Default constructor
     */
    public Administrateur(String nom, String prenom, String adresse, String mail) {
        super(nom,prenom,adresse,mail);
    }
}
