
import java.util.*;

/**
 * 
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nom, String description, String deadline,  Rendu rendu) {
        this.nom=nom;
        this.description=description;
        this.deadline=deadline;
        this.rendu = rendu;
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