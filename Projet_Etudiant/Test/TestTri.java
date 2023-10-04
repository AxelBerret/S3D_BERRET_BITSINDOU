import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTri {

    private Etudiant e1, e2, e3, e4, e5;

    private Formation formation;

    private Groupe groupe;

    @BeforeEach
    public void setup() {
        formation = new Formation(1);
        groupe = new Groupe(formation);
        e1 = new Etudiant(new Identite("1", "A", "AA"), formation);
        e2 = new Etudiant(new Identite("2", "B", "BB"), formation);
        e3 = new Etudiant(new Identite("3", "C", "CC"), formation);
        e4 = new Etudiant(new Identite("4", "D", "DD"), formation);
        e5 = new Etudiant(new Identite("5", "E", "EE"), formation);
        groupe.ajouterEtudiant(e3);
        groupe.ajouterEtudiant(e4);
        groupe.ajouterEtudiant(e2);
        groupe.ajouterEtudiant(e5);
        groupe.ajouterEtudiant(e1);
    }


    @Test
    public void test_01_triAlpha() {
        groupe.triAlpha();
        assertEquals("A", groupe.etudiants.get(0).identite.getNom());
        assertEquals("B", groupe.etudiants.get(1).identite.getNom());
        assertEquals("C", groupe.etudiants.get(2).identite.getNom());
        assertEquals("D", groupe.etudiants.get(3).identite.getNom());
        assertEquals("E", groupe.etudiants.get(4).identite.getNom());
    }

    @Test
    public void test_02_triAntiAlpha() {
        groupe.triAntiAlpha();
        assertEquals("A", groupe.etudiants.get(4).identite.getNom());
        assertEquals("B", groupe.etudiants.get(3).identite.getNom());
        assertEquals("C", groupe.etudiants.get(2).identite.getNom());
        assertEquals("D", groupe.etudiants.get(1).identite.getNom());
        assertEquals("E", groupe.etudiants.get(0).identite.getNom());
    }
}
