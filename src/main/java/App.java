import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	//log
	private static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) throws AnimalDansMauvaisSecteurException, IOException{
		// TODO Auto-generated method stub

		logger.warn("Debut de l'application");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		Zoo zoo = new Zoo();
		
		boolean flag = true ;
		
		while(flag) {
			
			 //menu(zoo);
			System.out.println("\n SuperZoo : Que souhaitez-vous faire ? "
					+ "\n 1 : Creer un nouveau zoo"
					+ "\n 2 : Ajouter un nouveau secteur"
					+ "\n 3 : Inscrire un nouvel animal"
					+ "\n 4: Renommer votre Zoo"
					+ "\n 0 : Quitter \n");
			
			System.out.println("Votre choix : ");
			String choix = br.readLine();
			
		         
		          switch(choix) {
		          
		            case "1": 
		              System.out.println("Quel est le nom du nouveau zoo ?");
		              String name = br.readLine();
		              zoo = new Zoo();
		              zoo.setName(name);
		              System.out.println("Zoo " + name + " créé !");
		            break;
		              case "2": 
		                   System.out.println("Quel type d'animal ?");
		                    String typeS = br.readLine();
		                    try {
		                        TypeAnimal type = TypeAnimal.valueOf(typeS);
		                        zoo.AjouterSecteur(type);
		                    }
		                    catch (Exception e) {
		                            System.out.println(typeS + "n'est pas un type reconnu.");
		                    }
		                break;
		              case "3": 
		                   System.out.println("Quel type d'animal ?");
		                   String typeA = br.readLine();
		                   try {
		                        TypeAnimal type = TypeAnimal.valueOf(typeA);

		                        System.out.println("Quel est le nom de l'animal ?");
		                      String nameA = br.readLine();
		                        Animal a;
		                        if(type == TypeAnimal.CHAT) {
		                            a = new Chat(nameA);
		                        }else if(type == TypeAnimal.CHIEN) {
		                                a = new Chien(nameA);
		                           }
		                    }
		                    catch (Exception e) {
		                            System.out.println(typeA + "n'est pas un type reconnu.");
		                    }
		                   break;
		              case "0":
		                   System.out.println("Au revoir.");
		                   flag = false;
		                   break;
		      }
			
			
			}
		
		
		
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
		
		System.out.println("nombre d'animaux : "+zoo.nombreAnimaux());
		
		logger.error("Une erreur !!!!");
	
	}

}
