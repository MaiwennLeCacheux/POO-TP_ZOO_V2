
public class App {

	public static void main(String[] args) throws AnimalDansMauvaisSecteurException{
		// TODO Auto-generated method stub

		
		Zoo zoo = new Zoo();
		zoo.AjouterSecteur(TypeAnimal.CHAT);
		zoo.AjouterSecteur(TypeAnimal.CHIEN);
		zoo.AjouterSecteur(TypeAnimal.CHAT);
		zoo.AjouterSecteur(TypeAnimal.CHIEN);
		zoo.AjouterSecteur(TypeAnimal.CHIEN);
		
		zoo.nouvelAnimal(new Chat("Felix"));
		zoo.nouvelAnimal(new Chat("Gandalf"));
		zoo.nouvelAnimal(new Chat("Malot"));
		zoo.nouvelAnimal(new Chat("Griffe"));
		zoo.nouvelAnimal(new Chat("Samuel"));
		zoo.nouvelAnimal(new Chat("Brad Pitt"));
		
		System.out.println(zoo.nombreAnimaux());
	
	}

}
