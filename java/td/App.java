package td;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        EnseignantCreator enseignantCreator = new EnseignantCreator();
        enseignantCreator.setPrenom("Lulu");
        enseignantCreator.setNom("Bobo");
        enseignantCreator.setHarpege("SJK");
        enseignantCreator.setNumem("5525d");
        enseignantCreator.setAdresse("MTP");
        enseignantCreator.setMail("jp@gxail.com");
        Enseignant enseignant = enseignantCreator.createEnseignant();

        EnseignantCreator enseignantCreator1 = new EnseignantCreator();
        enseignantCreator1.setPrenom("Fafa");
        enseignantCreator1.setNom("Aaa");
        enseignantCreator1.setHarpege("vfd");
        enseignantCreator1.setNumem("vfdvf");
        enseignantCreator1.setAdresse("MTP");
        enseignantCreator1.setMail("j@gxail.com");
        Enseignant enseignant1 = enseignantCreator.createEnseignant();

        ArrayList<Enseignant> c = new ArrayList<>();
        c.add(enseignant);
        c.add(enseignant1);

        EtudiantCreator etudiantCreator = new EtudiantCreator();
        etudiantCreator.setAdresse("Beziers");
        etudiantCreator.setMail("bckjdjs@gxail.com");
        etudiantCreator.setPrenom("Lulu");
        etudiantCreator.setNom("bob");
        etudiantCreator.setNumEtudiant("SJK");
        Etudiant etudiant = etudiantCreator.createEtudiant();

        EtudiantCreator etudiantCreator1 = new EtudiantCreator();
        etudiantCreator1.setAdresse("Beziers");
        etudiantCreator1.setMail("bckjdjs@gxail.com");
        etudiantCreator1.setPrenom("Lulu");
        etudiantCreator1.setNom("bob");
        etudiantCreator1.setNumEtudiant("SJK");
        Etudiant etudiant1 = etudiantCreator.createEtudiant();
        ArrayList<Etudiant> e = new ArrayList<>();
        e.add(etudiant1);
        e.add(etudiant);

        Cours maths = new Cours(c,e,enseignant);
        Rendu rendu= new Rendu("Doc","05/08/2021",5,maths);
        Rendu rendu1= new Rendu("Doc2","09/08/2021",10,maths);

        Devoir devoir = new Devoir("Maths","Devoir sur les proba","08/05/2021",5,rendu);
        Devoir devoir1 = new Devoir("Maths","Devoir sur les stat","09/05/2021",10,rendu1);

        AdminCreator adminCreator = new AdminCreator();
        adminCreator.setAdresse("Beziers");
        adminCreator.setMail("mlfdmsq@gxail.com");
        adminCreator.setPrenom("de");
        adminCreator.setNom("pern");
        Administrateur administrateur = adminCreator.createAdministrateur();

    }
}
