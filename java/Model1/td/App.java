public class App {
    public static void main(String[] args) {
        Administrateur administrateur= new Administrateur();
        Enseignant enseignant1 = new Enseignant("1451","451");
        Enseignant enseignant2 = new Enseignant("58","45");
        Cours maths = new Cours(enseignant1);
        Etudiant etudiant= new Etudiant("514");
        Etudiant etudiant1 = new Etudiant("5");
        Rendu rendu = new Rendu("01/08/2021",ER.CREATED,maths);
        Rendu rendu1 = new Rendu("08/08/2021",ER.CREATED,maths);
        Devoir devoir = new Devoir("Maths","DS","01/08/2021",rendu);
        Devoir devoir1 = new Devoir("Info","DS","08/08/2021",rendu1);


        maths.uploadDoc("Doc",rendu,etudiant);
        rendu.setEnseignant(enseignant2);
        rendu.setNote(5);
        rendu1.setEnseignant(enseignant2);
        rendu1.setNote(51);
        System.out.println( maths.getCertificat().getEtat());
        System.out.println(maths.getCertificat().getTotalPoint());


    }
}
