package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class verifcontrainteTest {
	public verifcontrainte ch, id1, t, p, h, s, g, al;

	@Before
	public void setUp() throws Exception {
		this.ch = new verifcontrainte();
		this.id1 = new verifcontrainte();
		this.t = new verifcontrainte();
		this.p = new verifcontrainte();
		this.h = new verifcontrainte();
		this.s = new verifcontrainte();
		this.g = new verifcontrainte();
		this.al = new verifcontrainte();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testChampNotEmpty() {
		assertTrue(ch.verifChamp(""));
	}

	// test id candidat 0,10, -3

	@Test
	public void testId() {
		assertTrue(id1.validId(0));
	}

	@Test
	public void testId2() {
		assertTrue(id1.validId(10));
	}

	@Test
	public void testId3() {
		assertTrue(id1.validId(-3));
	}
	// tester titre avec 2,3 ,8 longueur chaine de caratere

	@Test
	public void testtitre1() {
		assertTrue(t.validTitre("Fo"));
	}

	@Test
	public void testtitre2() {
		assertTrue(t.validTitre("For"));
	}

	@Test
	public void testtitre3() {
		assertTrue(t.validTitre("Formatio"));
	}
	// tester le prix avec les valeurs de 0, 100, 250

	@Test
	public void testPrix1() {
		assertTrue(p.validprix(0));
	}

	@Test
	public void testPrix2() {
		assertTrue(p.validprix(100));
	}

	@Test
	public void testPrix3() {
		assertTrue(p.validprix(250));
	}

	// tester le nombre d'heure 10,11,40
	@Test
	public void testNbHeures1() {
		assertTrue(h.validNbHeures(10));
	}

	@Test
	public void testNbHeures2() {
		assertTrue(h.validNbHeures(11));
	}

	@Test
	public void testNbHeures3() {
		assertTrue(h.validNbHeures(40));
	}

	// tester les champs de session "présentiels" ou "en ligne"
	@Test
	public void testSession1() {
		assertTrue(s.validSessions("présentiels"));
	}

	@Test
	public void testSession2() {
		assertTrue(s.validSessions("en ligne"));
	}
	// tester les grades "junior", "senior" et "expert
	@Test
	public void testGrades1() {
		assertTrue(g.validGradesFormateur("junior"));
	}
	@Test
	public void testGrades2() {
		assertTrue(g.validGradesFormateur("senior"));
	}
	@Test
	public void testGrades3() {
		assertTrue(g.validGradesFormateur("expert"));
	}
	
}
