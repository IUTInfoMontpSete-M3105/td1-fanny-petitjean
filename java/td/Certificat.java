package td;

import java.util.*;

/**
 * 
 */
public class Certificat {

    /**
     * Default constructor
     */
    public Certificat() {
    }

    /**
     * 
     */
    private int totalPoint;

    /**
     * 
     */
    private String appreciation;

    /**
     * 
     */
    private EP etat;


    /**
     * @param note
     */
    public void updatePart(int note) {
        totalPoint+=note;
    }
    public void delivrerCertificat() {
        // TODO implement here
    }

}