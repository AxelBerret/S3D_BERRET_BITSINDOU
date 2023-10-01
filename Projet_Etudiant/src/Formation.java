import java.util.HashMap;
import java.util.Iterator;

public class Formation {

    /**
     * attribut id de la classe Formation
     * represente l identifiant de la formation
     */
    private int id;

    /**
     * attribut matieresCoeff de la classe Formation
     * represente la collection des matieres de la formation
     * par leurs noms et leurs coefficients
     */
    private HashMap<String, Float> matieresCoeff;


    /**
     * constructeur qui cree des objets de types Formation
     * a l aide des donnees passees en parametres
     * @param pId identifiant que l on souhaite donner a la formation
     */
    public Formation(int pId) {
        this.id = id;
        this.matieresCoeff = new HashMap<String, Float>();
    }


    /**
     * methode getId de la classe Formation
     * @return l attribut id
     */
    public float getId() {return this.id;}

    /**
     * methode obtenirCoeffMatiere de la classe Formation
     * @param matiere matiere dont l on souhaite connaitre le coefficient
     * @return le coefficient de la matiere pointee
     */
    public float obtenirCoeffMatiere(String matiere) {
        //si la matiere n existe pas dans la collection
        Float res = this.matieresCoeff.get(matiere);
        if (!this.matieresCoeff.containsKey(matiere)) {
            res = -1.0f;
        }
        return res;
    }

    /**
     * methode ajouterMatiere de la classe Formation
     * permet d ajouter une matiere a la collection des matieres
     * @param matiere matiere que l on souhaite ajouter
     * @param coeff coefficient que l on souhaite donner a la matiere
     */
    public void ajouterMatiere(String matiere, float coeff) {this.matieresCoeff.put(matiere, coeff);}

    /**
     * methode supprimerMatiere de la classe Formation
     * permet de supprimer une matiere de la collection des matieres
     * @param matiere que l on souhaite supprimer de la collection
     */
    public void supprimerMatiere(String matiere) {this.matieresCoeff.remove(matiere);}


}
