package td1;

import java.util.*;

/**
 * 
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nom, String description, String deadline,int nbPoint,Rendu rendu) {
        this.nom=nom;
        this.deadline=deadline;
        this.description=description;
        this.nbPoint=nbPoint;
        this.rendu=rendu;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String deadline;

    /**
     * 
     */
    private int nbPoint;
    private Rendu rendu;



}