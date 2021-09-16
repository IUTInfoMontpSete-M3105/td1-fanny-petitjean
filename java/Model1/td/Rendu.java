
import java.util.*;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(String date, ER etat, Cours cours) {
        this.date=date;
        this.etat=etat;
        this.cours=cours;
    }

    /**
     * 
     */
    private String doc;

    /**
     * 
     */
    private String date;

    /**
     * 
     */
    private int note;

    /**
     *
     */
    private ER etat;

    private Cours cours;

    private Enseignant enseignant;
    private Etudiant etudiant;




    /**
     * @param doc
     */
    public void setDocument(String doc) {
        this.doc=doc;
    }

    /**
     * 
     */
    public String getDoc() {
        return doc;
    }

    /**
     * @param note
     */
    public void setNote(int note) {
        this.note = note;
        this.etat = ER.EVALUATED;
        cours.getCertificat().updatePart(note);
        cours.informerEtu(note);
    }

    /**
     * @param ens
     */
    public void setEnseignant(Enseignant ens) {
        cours.informerEns(ens);
        this.etat = ER.ASSIGNED;
    }

    public void setEtat(ER etat){
        this.etat=etat;
    }

    public ER getEtat(){
        return etat;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}