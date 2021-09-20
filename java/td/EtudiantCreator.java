package td;

/**
 * 
 */
public class EtudiantCreator extends UtilisateurCreator {


    /**
     * 
     */
    private String numEtudiant;
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

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public Etudiant createEtudiant() {
        return new Etudiant(nom, prenom, adresse, mail, numEtudiant);
    }


}