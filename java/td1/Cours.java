package td1;

import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(ArrayList<Enseignant>  enseignants, ArrayList<Etudiant> etudiants, Enseignant cdc) {
        this.tousLesEnseignant=enseignants;
        this.etudiants=etudiants;
        this.CDC =cdc;
    }



    /**
     * 
     */
    public Enseignant CDC;

    public ArrayList<Enseignant> tousLesEnseignant;
    public ArrayList<Etudiant> etudiants;



    /**
     * @param doc
     */
    public void uploadDoc(String doc) {
        // TODO implement here
    }

    /**
     * @param ens
     */
    public void informerEns(EnseignantCreator ens) {
        // TODO implement here
    }

    /**
     * @param note
     */
    public void informerEtu(int note) {
        // TODO implement here
    }

}