import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAjoutSuppGroupe {

    private Formation formation;
    private Groupe groupe;
    private Identite ide1;
    private Identite ide2;
    private Etudiant etudiant;
    private Etudiant etudiant2;
    @BeforeEach
    public void preparerDonnees() {
        formation = new Formation(01);
        groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant2 = new Etudiant(ide2, formation);

    }

    //test si l'etudiant est bien ajouté au groupe
    @Test
    public void testAjouterEtu_OK(){ //ne focntionne pas
        groupe.ajouterEtudiant(etudiant);
        assertEquals(1, groupe.etudiants.size());
    }

    //test si l'etudiant est supprimé du groupe
    @Test
    public void testSupprimerEtu_OK(){ //ne focntionne pas
        groupe.ajouterEtudiant(etudiant);
        groupe.supprimerEtudiant(etudiant);
        assertEquals(0, groupe.etudiants.size());
    }
}
