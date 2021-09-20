package td;

import java.util.*;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu() {
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

    private Enseignant enseignant;



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
        this.note=note;
    }

    /**
     * @param ens
     */
    public void setEnseignant(Enseignant ens) {
        this.enseignant=ens;
    }

}