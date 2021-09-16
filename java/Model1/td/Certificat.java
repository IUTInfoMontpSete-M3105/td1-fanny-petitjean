
import java.util.*;

/**
 * 
 */
public class Certificat {

    /**
     * Default constructor
     */
    public Certificat(Etudiant etudiant) {
        this.etat=EP.CREATED;
        this.etudiant=etudiant;
    }

    /**
     * 
     */
    private int totalPoint;

    /**
     * 
     */
    private String appreciation;

    public EP getEtat() {
        return etat;
    }

    /**
     *
     */
    private EP etat;
    private Etudiant etudiant;

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
        if(totalPoint>=10){
            this.etat = EP.POSITIF;
        }else{
            etat = EP.NEGATIF;
        }
    }

    public void setEtat(EP etat) {
        this.etat = etat;
    }

    public void updatePart(int note) {
        totalPoint +=note;
        etat = EP.UNDEREVALUATION;
    }



}