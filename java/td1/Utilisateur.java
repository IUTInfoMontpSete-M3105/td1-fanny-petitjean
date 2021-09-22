package td1;

public abstract class Utilisateur {

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
    public Utilisateur(String nom, String prenom, String adresse, String mail) {
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.mail=mail;
    }
}
