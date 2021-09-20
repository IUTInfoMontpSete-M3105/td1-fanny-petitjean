package td;

/**
 * 
 */
public class AdminCreator extends UtilisateurCreator {


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
    public AdminCreator() {
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    public Administrateur createAdministrateur() {
        return new Administrateur(nom, prenom, adresse, mail);
    }
}