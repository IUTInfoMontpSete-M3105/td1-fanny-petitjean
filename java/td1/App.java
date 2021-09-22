package td1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Enseignant enseignant = new Enseignant("Bobo","lulu","Montpellier","Bl@gmail.com","526","5545");

        Enseignant enseignant1 = new Enseignant("Bo","lu","Beziers","l@gmail.com","5566","95");

        ArrayList<Enseignant> c = new ArrayList<>();
        c.add(enseignant);
        c.add(enseignant1);


        Etudiant etudiant =new Etudiant("ju","anf","Montpellier","jl@gmail.com","56");

        Etudiant etudiant1 = new Etudiant("pal","paul","sete","b@gmail.com","58");
        ArrayList<Etudiant> etudiantArrayList = new ArrayList<>();
        etudiantArrayList.add(etudiant);
        etudiantArrayList.add(etudiant1);

        Cours maths = new Cours(c,etudiantArrayList,enseignant);
        Rendu rendu= new Rendu("Doc","05/08/2021",5,maths);
        Rendu rendu1= new Rendu("Doc2","09/08/2021",10,maths);

        Devoir devoir = new Devoir("Maths","Devoir sur les proba","08/05/2021",5,rendu);
        Devoir devoir1 = new Devoir("Maths","Devoir sur les stat","09/05/2021",10,rendu1);


        Administrateur administrateur = new Administrateur("ju","anf","Montpellier","jl@gmail.com");

    }
}
