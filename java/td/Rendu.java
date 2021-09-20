package td;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(String doc, String date,int note,Cours cours) {
        this.doc=doc;
        this.date=date;
        this.note=note;
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

    private Enseignant enseignant;
    private Cours cours;



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
        this.enseignant =ens;
    }

}