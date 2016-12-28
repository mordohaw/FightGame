package monster;

public abstract class Monster {
	 private int health;
	 private int attack;
	 private int defense;
	 
	 


	public Monster(int health,int luck,int intellect,int attack){
		this.health=health;
		this.attack=attack;
		this.defense=((intellect+luck)/2);
		 
	 }
	 
	public int getDodge() {
		return defense;
	}

	 public int getHealth() {
			return health;
	}
	
	public int getDefense() {
		return defense;
	}

	 
	 public int getAttack() {
			return attack;
	}

}
