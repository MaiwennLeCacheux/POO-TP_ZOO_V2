import java.util.Comparator;

public class SecteurComparator implements Comparator<Secteur> {
	
	@Override
	public int compare(Secteur s1, Secteur s2) {
		// TODO Auto-generated method stub
		return  s1.getNombreAnimaux() - s2.getNombreAnimaux();
	}

}
