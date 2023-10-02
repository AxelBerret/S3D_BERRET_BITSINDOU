import java.util.ArrayList;
import java.util.HashMap;

public class Etudiant {

    //attributs
    private Identite identite;
    private HashMap<String, ArrayList<Float>> résultats;
    Formation formation;

    /**
     * constructeur de la classe Etudiant
     */
    public Etudiant (Identite id, Formation f){
        this.identite =id;
        this.résultats = new HashMap<String, ArrayList<Float>>();
        this.formation = f;
    }

    /**
     * Méthode ajouterNote qui ajoute la note de l'étudaint à une matière donnée
     * @param matiere: la matière dans laquelle on veut ajouter la note
     * @param note : la note à ajouter
     */
    public void ajouterNote(String matiere, Float note) {
        try{
            if (this.résultats.containsKey(matiere) && note >0 && note <=20){
                this.résultats.get(matiere).add(note);
            }
        } catch (Exception e) {
            System.out.println("La note n'a pas pu être ajoutée");
        }
    }

    /**
     * Méthode calculerMoyenne qui calcule la moyenne d'un étudiant pour une matière entrée en paramètre
     * @param matiere : la matière pour laquelle on veut calculer la moyenne
     * @return la moyenne de l'étudiant pour la matière entrée en paramètre
     */
    public Float calculerMoyenne(String matiere) {
        ArrayList <Float> listeNotes = this.résultats.get(matiere);
        float somme = 0;
        for (Float note : listeNotes){
            somme += note;
        }
        Float res = somme/listeNotes.size();
        return res;
    }

    /**
     * Méthode calculerMoyenneGénérale qui calcule la moyenne générale de l'étudiant
     * avec la prise en compte des coefficients
     * @return la moyenne générale de l'étudiant
     */
    public Float calculerMoyenneGénérale() {
        float somme = 0;
        float sommeCoeff = 0;
        for (String matiere : this.résultats.keySet()){
            Float coeff = this.formation.obtenirCoeffMatiere(matiere);
            somme += this.calculerMoyenne(matiere)*this.formation.obtenirCoeffMatiere(matiere);
            sommeCoeff += this.formation.obtenirCoeffMatiere(matiere);
        }
        Float res = somme/sommeCoeff;
        return res;
    }

    public HashMap<String, ArrayList<Float>> getResultats() {return this.résultats;}
}
