import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculMoy {

    private Formation formation;
    private Groupe groupe;
    private Identite ide1;
    private Identite ide2;
    private Etudiant etudiant;
    private Etudiant etudiant2;

    /*@BeforeEach
    public void preparerDonnees(){
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant2 = new Etudiant(ide2, formation);
        //Ajout des notes de maths de Axel et Célie
        etudiant.getResultats().get("Mathématiques").add(10.0f);
        etudiant2.getResultats().get("Mathématiques").add(12.0f);
        //Ajout des notes d'info de Axel et Célie
        etudiant.getResultats().get("Informatique").add(10.0f);
        etudiant2.getResultats().get("Informatique").add(12.0f);
    }*/

    //teste quand la moyenne est calculée avec une matière existante
    @Test
    public void test_calculerMoyenneGroupe_OK(){
        //préparation des données
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant2 = new Etudiant(ide2, formation);
        //Ajout des notes de maths de Axel et Célie
        etudiant.getResultats().get("Mathématiques").add(10.0f);
        etudiant2.getResultats().get("Mathématiques").add(12.0f);
        //Ajout des notes d'info de Axel et Célie
        etudiant.getResultats().get("Informatique").add(10.0f);
        etudiant2.getResultats().get("Informatique").add(12.0f);

        //Ajout des étudiants au groupe
        groupe.ajouterEtudiant(etudiant);
        groupe.ajouterEtudiant(etudiant2);
        //Vérifie que la moyenne du groupe est bien calculée
        assertEquals(11.0f, groupe.calculerMoyenneGroupe("Mathématiques"), 0.01);
        assertEquals(11.0f, groupe.calculerMoyenneGroupe("Informatique"), 0.01);
    }

    //teste quand la moyenne est calculée avec une matière inexistante
    @Test
    public void test_calculerMoyenneGroupe_MatiereInexistante(){
        //préparation des données
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant2 = new Etudiant(ide2, formation);
        //Ajout des notes de maths de Axel et Célie
        etudiant.getResultats().get("Mathématiques").add(10.0f);
        etudiant2.getResultats().get("Mathématiques").add(12.0f);
        //Ajout des notes d'info de Axel et Célie
        etudiant.getResultats().get("Informatique").add(10.0f);
        etudiant2.getResultats().get("Informatique").add(12.0f);

        //Ajout des étudiants au groupe
        groupe.ajouterEtudiant(etudiant);
        groupe.ajouterEtudiant(etudiant2);
        //Vérifie que la moyenne du groupe est bien calculée
        assertEquals(0.0f, groupe.calculerMoyenneGroupe("Français"), 0.01);
    }

    //teste quand la moyenne générale du groupe est calculée
    @Test
    public void test_calculerMoyenneGenerale_OK(){
        //préparation des données
        formation = new Formation(01);
        this.groupe = new Groupe(formation);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
        ide1 = new Identite("123", "Berret", "Axel");
        etudiant = new Etudiant(ide1, formation);
        ide2 = new Identite("456", "Ponroy", "Célie");
        etudiant2 = new Etudiant(ide2, formation);
        //Ajout des notes de maths de Axel et Célie
        etudiant.getResultats().get("Mathématiques").add(10.0f);
        etudiant2.getResultats().get("Mathématiques").add(12.0f);
        //Ajout des notes d'info de Axel et Célie
        etudiant.getResultats().get("Informatique").add(10.0f);
        etudiant2.getResultats().get("Informatique").add(12.0f);

        //Ajout des étudiants au groupe
        groupe.ajouterEtudiant(etudiant);
        groupe.ajouterEtudiant(etudiant2);
        //Vérifie que la moyenne générale du groupe est bien calculée
        assertEquals(11.0f, groupe.calculerMoyenneGenerale(), 0.01);
    }
}
