
import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(Enseignant cdc) {
        this.CDC = cdc;
    }



    /**
     * 
     */
    private Enseignant CDC;
    private Certificat certificat;





    /**
     * @param doc
     */
    public void uploadDoc(String doc, Rendu rendu, Etudiant etudiant) {
        rendu.setDocument(doc);
        rendu.setEtat(ER.UPLOADED);
        rendu.setEtudiant(etudiant);
        certificat = new Certificat(etudiant);

    }

    public Certificat getCertificat() {
        return certificat;
    }

    /**
     * @param ens
     */
    public String informerEns(Enseignant ens) {
        return  "Un devoir vous a été assigné";
    }

    /**
     * @param note
     */
    public String informerEtu(int note) {
        return "Votre rendu a été évalué à la note de " + note;
    }

}