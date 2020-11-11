import java.util.ArrayList;


public class Zoo {
	
	private final int LIMITE_SECTEUR = 15;
	private int visiteur;
	private ArrayList<Secteur> secteursAnimaux;
	
	public Zoo() {
		this.visiteur = 0 ;
		secteursAnimaux = new ArrayList<Secteur>();
	}
	
	public void AjouterSecteur(TypeAnimal type) {
		secteursAnimaux.add(new Secteur(type));
	}
	
	//utilisation de la fonction getLimite qui calcule !!
	public void nouveauVisiteur() throws LimiteVisiteurException {
		if (visiteur >= getLimiteVisiteur()) {
			throw new LimiteVisiteurException("visiteur en trop");
		}
		visiteur += 1;
	}
	
	public int getLimiteVisiteur() {
		return LIMITE_SECTEUR * secteursAnimaux.size();
	}
	
	public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
			getSecteurFromType(a.getTypeAnimal()).ajouterAnimal(a);
	}
	
	public int nombreAnimaux() {
		return secteursAnimaux.stream().mapToInt(x->x.getNombreAnimaux()).sum();
	}
	
	public Secteur getSecteurFromType(TypeAnimal type) {
		return secteursAnimaux.stream().filter(s -> s.obtenirType() == type).findFirst().orElse(null);
	}
}
