import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class TestAjoutSuppGroupe {

    private Formation formation;
    private Formation formation2;
    private Groupe groupe;
    private Identite ide1;
    private Identite ide2;
    private Etudiant etudiant;
    private Etudiant etudiant2;
    /*@BeforeEach //ne fonctionne pas
    public void preparerDonnees() {
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant2 = new Etudiant(ide2, formation);
    }*/

    //teste si l'etudiant est bien ajouté au groupe
    @Test
    public void testAjouterEtu_OK(){
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        groupe.ajouterEtudiant(etudiant);
        //vérifie que l'étudiant soit dans le groupe
        assertTrue(groupe.etudiants.contains(etudiant));
    }

    //teste quand l'étudiant ajouté n'a pas la même formation que le groupe
    @Test
    public void testAjouterEtu_Formation_Diff(){
        formation = new Formation(01);
        formation2 = new Formation(02);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        formation2.ajouterMatiere("Art", 10.0f);
        ide1 = new Identite("123", "Ponroy", "Célie");
        etudiant = new Etudiant(ide1, formation2);
        groupe.ajouterEtudiant(etudiant);
        //Vérifie que l'étudiant n'est pas dans le groupe
        assertFalse(groupe.etudiants.contains(etudiant));
    }

    //teste si l'etudiant est supprimé du groupe
    @Test
    public void testSupprimerEtu_OK(){
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant = new Etudiant(ide1, formation);
        etudiant2 = new Etudiant(ide2, formation);
        groupe.ajouterEtudiant(etudiant);
        groupe.ajouterEtudiant(etudiant2);
        groupe.supprimerEtudiant(etudiant);
        assertTrue(groupe.etudiants.contains(etudiant2));
    }

    //
}
