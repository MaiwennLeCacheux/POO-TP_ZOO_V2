
public abstract class Animal {
	
	protected String nomAnimal;
	protected TypeAnimal typeAnimal;
	
	/* NON !!! On fait un constructeur personnalisé dans les classes filles par rapport au type
	 public Animal(String nomA, TypeAnimal typeA) {
	 
		this.nomAnimal = nomA;
		this.typeAnimal = typeA;
	}*/
	
	public String getNomAnimal() {
		return nomAnimal;
	}
	
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}
}
