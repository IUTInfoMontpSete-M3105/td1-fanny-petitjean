package td1;

public class Etudiant extends Utilisateur{

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
        super(nom,prenom,adresse,mail);
        this.numEtudiant=numEtudiant;
    }
}
