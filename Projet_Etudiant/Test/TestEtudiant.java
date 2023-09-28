import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEtudiant {

    @BeforeEach
    public void preparationDonnes() {

        Formation formation = new Formation(5);
        //initialisation des matières de la formation
        formation.ajouterMatiere("Maths", 2);
        formation.ajouterMatiere("Physique", 3);
        formation.ajouterMatiere("Anglais", 1);

        Identite id1 = new Identite("123", "Berret", "Axel");
        Identite id2 = new Identite("456", "Ponroy", "Célie");
        Identite id3 = new Identite("789", "Arcelin", "Nino");

        Etudiant etu1 = new Etudiant(id1, formation);
        Etudiant etu2 = new Etudiant(id2, formation);
        Etudiant etu3 = new Etudiant(id3, formation);
    }


    //teste la méthode ajouterMatieres
    public void test_01_ajouterMatieres() {


    }
}
