import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Etudiant {
    protected Identite identite;
    protected Formation formation;
    protected HashMap<String, List<Float>> resultats;

    public Etudiant(Identite identite, Formation formation) {
        this.identite = identite;
        this.formation = formation;
        this.resultats = new HashMap<>();

        // Initialisation des listes de résultats pour chaque matière de la formation.
        for (String matiere : formation.getMatieresCoeff().keySet()) {
            resultats.put(matiere, new ArrayList<>());
        }
    }

    public void ajouterNote(String matiere, float note) {
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("La note n'est pas valide : doit être entre 0 et 20.");
        }

        List<Float> notesMatiere = resultats.get(matiere);
        if (notesMatiere == null) {
            throw new IllegalArgumentException("La matière n'existe pas dans la formation.");
        }

        notesMatiere.add(note);
    }

    public float calculerMoyenne(String matiere) {
        List<Float> notesMatiere = resultats.get(matiere);
        if (notesMatiere == null || notesMatiere.isEmpty()) {
            return 0.0f; // Aucune note disponible, moyenne par défaut.
        }

        float somme = 0;
        for (Float note : notesMatiere) {
            somme += note;
        }
        return somme / notesMatiere.size();
    }

    public float calculerMoyenneGenerale() {
        float sommePonderee = 0;
        float sommeCoefficients = 0;

        for (String matiere : formation.getMatieresCoeff().keySet()) {
            float coefficient = formation.obtenirCoeffMatiere(matiere);
            List<Float> notesMatiere = resultats.get(matiere);

            if (coefficient <= 0) {
                throw new IllegalArgumentException("Le coefficient de la matière est invalide : " + matiere);
            }

            if (notesMatiere != null && !notesMatiere.isEmpty()) {
                float moyenneMatiere = calculerMoyenne(matiere);
                sommePonderee += moyenneMatiere * coefficient;
                sommeCoefficients += coefficient;
            }
        }

        if (sommeCoefficients == 0) {
            throw new ArithmeticException("Division par zéro : sommeCoefficients est égal à zéro.");
        }

        return sommePonderee / sommeCoefficients;
    }

    public HashMap<String, List<Float>> getResultats() {
        return resultats;
    }
}
