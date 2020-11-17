import java.util.ArrayList;
import java.util.Comparator;

public class Secteur implements Comparator<Secteur>, Comparable<Secteur> {

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

	@Override
	public int compare(Secteur s1, Secteur s2) {
		// TODO Auto-generated method stub
		return  s1.getNombreAnimaux() - s2.getNombreAnimaux();
	}

	@Override
	public int compareTo(Secteur s1) {
		// TODO Auto-generated method stub
		return this.getNombreAnimaux() - s1.getNombreAnimaux(); //PROF
	}
}
