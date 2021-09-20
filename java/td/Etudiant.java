package td;

public class Etudiant {

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

    public Etudiant(String nom, String prenom, String adresse,String mail,String numEtudiant) {
        this.numEtudiant = numEtudiant;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.mail=mail;
    }
}
