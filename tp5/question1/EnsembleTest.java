package question1;

public class EnsembleTest extends junit.framework.TestCase {

    public void testUnion() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> union = e1.union(e2);
        assertEquals(3, union.size());
        assertTrue(union.contains(2));
        assertTrue(union.contains(3));
        assertTrue(union.contains(4));
    }
    
    public void testIntersection() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> intersection = e1.inter(e2);
        assertEquals(1, intersection.size());
        assertFalse(intersection.contains(2));
        assertTrue(intersection.contains(3));
        assertFalse(intersection.contains(4));
    }
    
    public void testDifference() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> difference = e1.diff(e2);
        assertEquals(1, difference.size());
        assertTrue(difference.contains(2));
        assertFalse(difference.contains(3));
        assertFalse(difference.contains(4));
    }
    
    public void testDiffSymetrique() {
        question1.Ensemble<Integer> e1, e2;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        question1.Ensemble<Integer> diffSymetrique = e1.diffSym(e2);
        assertEquals(2, diffSymetrique.size());
        assertTrue(diffSymetrique.contains(2));
        assertFalse(diffSymetrique.contains(3));
        assertTrue(diffSymetrique.contains(4));
    }
    
}
