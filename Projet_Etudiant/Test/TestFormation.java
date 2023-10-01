import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestFormation {
    private Formation formation;

    @Before
    public void preparerDonnees() {
        formation = new Formation(1);
        formation.ajouterMatiere("Mathématiques", 3.5f);
        formation.ajouterMatiere("Informatique", 4.0f);
    }

    @Test
    public void testAjouterMatiere() {
        //assertEquals(2, formation.obtenirCoeffMatiere().size());
        assertEquals(3.5f, formation.obtenirCoeffMatiere("Mathématiques"), 0.01);
        assertEquals(4.0f, formation.obtenirCoeffMatiere("Informatique"), 0.01);
    }

    @Test
    public void testObtenirCoeffMatiere() {
        assertEquals(3.5f, formation.obtenirCoeffMatiere("Mathématiques"), 0.01);
        assertEquals(4.0f, formation.obtenirCoeffMatiere("Informatique"), 0.01);
    }

    @Test
    public void testObtenirCoeffMatiereInexistante() {
        assertEquals(-1.0f, formation.obtenirCoeffMatiere("Introuvable"), 0.01);
    }

    @Test
    public void testSupprimerMatiere() {
        formation.supprimerMatiere("Mathématiques");

        //assertEquals(1, formation.getMatieresCoeff().size());
        assertEquals(-1.0f, formation.obtenirCoeffMatiere("Mathématiques"), 0.01);
    }
}
