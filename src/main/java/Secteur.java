import java.util.ArrayList;

public class Secteur {

	private TypeAnimal typeAnimauxDansSecteurs;
	private ArrayList<Animal> animauxDansSecteur;
	
	public Secteur(TypeAnimal typeA) {
		this.typeAnimauxDansSecteurs = typeA;
		animauxDansSecteur = new ArrayList<Animal>();
	}
	
	public void ajouterAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
		if (a.getTypeAnimal() != this.typeAnimauxDansSecteurs) {
			throw new AnimalDansMauvaisSecteurException("erreur type anima ajout dans Secteur");
		}
		
		animauxDansSecteur.add(a);
	}
	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	public TypeAnimal obtenirType() {
		return typeAnimauxDansSecteurs;
	}
}
