import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEtudiant {

    private Identite id1, id2;
    private Etudiant e1, e2;
    private Formation f1, f2;
    private String m1, m2, m3;
    private ArrayList<Float> notes1;
    private ArrayList<Float> notes2;
    private ArrayList<Float> notes3;
    private ArrayList<Float> notes4;
    private ArrayList<Float> notes5;
    private ArrayList<Float> notes6;

    @BeforeEach
    public void preparationDonnees() {
        id1 = new Identite("123", "Berret", "Axel");
        id2 = new Identite("456", "Ponroy", "Célie");
        f1 = new Formation(1);
        f2 = new Formation(2);
        e1 = new Etudiant(id1,f1);
        e2 = new Etudiant(id2,f2);
        m1 = "Mathematiques";
        m2 = "Physique";
        m3 = "Chimie";

        notes1.add(10.0f);
        notes1.add(12.0f);
        notes1.add(9.0f);
        notes2.add(10.0f);
        notes2.add(12.0f);
        notes2.add(16.0f);
        notes3.add(8.0f);
        notes3.add(7.0f);
        notes3.add(11.0f);
        notes4.add(13.0f);
        notes4.add(17.0f);
        notes4.add(18.0f);
        notes5.add(19.0f);
        notes5.add(12.0f);
        notes5.add(14.0f);
        notes6.add(15.0f);
        notes6.add(20.0f);
        notes6.add(2.0f);

        e1.getResultats().put(m1, notes1);
        e1.getResultats().put(m2, notes2);
        e1.getResultats().put(m3, notes3);
        e2.getResultats().put(m1, notes4);
        e2.getResultats().put(m2, notes5);
        e2.getResultats().put(m3, notes6);
    }



}
