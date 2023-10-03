import java.util.ArrayList;

public class Groupe {

    //attributs
    protected Formation formation;
    protected ArrayList<Etudiant> etudiants;


    /**
     * constructeur qui cree des objets de types Groupe
     * a l aide des donnees passees en parametres
     * @param pFormation formation que l on souhaite donner au groupe
     */
    public Groupe( Formation pFormation) {
        this.etudiants = new ArrayList<Etudiant>();
        this.formation = pFormation;
    }

    /**
     * methode ajouterEtudiant de la classe Groupe
     * permet d ajouter un etudiant a la collection des etudiants
     * Attention, on peut ajouter un étudiant à un groupe
     * uniquement si le groupe et l’étudiant ont la même formation
     * @param etudiant etudiant que l on souhaite ajouter
     */
    public void ajouterEtudiant(Etudiant etudiant) {
        if(etudiant.formation == this.formation){
            this.etudiants.add(etudiant);
        }
    }

    /**
     * methode supprimerEtudiant de la classe Groupe
     * permet de supprimer un etudiant de la collection des etudiants
     * @param etudiant que l on souhaite supprimer de la collection
     */
    public void supprimerEtudiant(Etudiant etudiant) {
        this.etudiants.remove(etudiant);
    }

    /**
     * methode calculerMoyenneGroupe de la classe Groupe
     * permet de calculer la moyenne du groupe pour une matiere donnee
     * @return la moyenne du groupe
     */
    public Float calculerMoyenneGroupe(String matiere) {
        float somme = 0;
        for (Etudiant etudiant : this.etudiants) {
            somme += etudiant.calculerMoyenne(matiere);
        }
        Float res = somme / this.etudiants.size();
        return res;
    }

    /**
     * methode calculerMoyenneGenerale de la classe Groupe
     * permet de calculer la moyenne générale du groupe
     * @return la moyenne du groupe
     */
    public Float calculerMoyenneGenerale() {
        float somme = 0;
        for (Etudiant etudiant : this.etudiants) {
            somme += etudiant.calculerMoyenneGenerale();
        }
        Float res = somme / this.etudiants.size();
        return res;
    }

}