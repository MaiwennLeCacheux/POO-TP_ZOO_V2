import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestApp {

	public void addVisiteur(Zoo zoo, int nbvisiteurs) throws LimiteVisiteurException {
		for (int i=0; i< nbvisiteurs; i++) {
			zoo.nouveauVisiteur();
		}
	}
	
	@Test
	public void testNbVisiteursOK() {
		Zoo zoo = new Zoo();
		zoo.AjouterSecteur(TypeAnimal.CHAT);
		Throwable e = null;
		
		try {
			addVisiteur(zoo, 15);
		}catch (Throwable ex) {
			e = ex;
		}
		
		assertFalse(e instanceof LimiteVisiteurException);
	}
	
	@Test
	public void testNbVisiteursKO() {
		Zoo zoo = new Zoo();
		zoo.AjouterSecteur(TypeAnimal.CHAT);
		Throwable e = null;
		
		try {
			addVisiteur(zoo, 18);
		}catch (Throwable ex) {
			e = ex;
		}
		
		assertTrue(e instanceof LimiteVisiteurException);
	}
	
	
	@Test
	public void testNbAnimaux() {
		Throwable e = null;
		Zoo zoo = new Zoo();
		zoo.AjouterSecteur(TypeAnimal.CHIEN);
		
		try {
			zoo.nouvelAnimal(new Chien("Rex"));
		}catch (AnimalDansMauvaisSecteurException exc) {
			e = exc;
		}
		
		assertFalse(e instanceof AnimalDansMauvaisSecteurException);
		assertEquals(1,zoo.nombreAnimaux());
	}
	
	@Test
	public void testComparaisonSecteur() throws AnimalDansMauvaisSecteurException {
		
		Secteur secteur1 = new Secteur(TypeAnimal.CHAT);
		Secteur secteur2 = new Secteur(TypeAnimal.CHIEN);
		
		assertEquals(0,secteur1.compareTo(secteur2));
		
		secteur1.ajouterAnimal(new Chat("Riri"));
		
		assertTrue(secteur1.compareTo(secteur2) > 0);
		
	}
}
