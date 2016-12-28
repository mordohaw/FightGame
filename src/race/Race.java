package race;

public abstract class Race {
	 private int health;
	 private int agility;
	 private int magic;
	 private int charisma;
	 private int perception;
	 private int intellect;
	 private int ego;
	 private int attack;
	


	public Race(int strength,int agility, int dexterity, int magic, int charisma, int endurance, int perception, int intellect, int ego){
		
		 this.health=10*(endurance);
		 this.attack=(1/3)*dexterity+(2/3)*strength;
		 this.agility=agility;
		 this.magic=magic;
		 this.charisma=charisma;
		 this.perception=perception;
		 this.intellect=intellect;
		 this.ego=ego;
	 }
	
	public int getAttack() {
		return attack;
	}
	
	public int getEgo() {
		return ego;
	}

	public int getIntellect() {
		return intellect;
	}
	
	public int getPerception() {
		return perception;
	}
	
	
	
	 
	public int getAgility() {
		return agility;
	}


	
	public int getMagic() {
		return magic;
	}
	
	public int getCharisma() {
		return charisma;
	}


	public int getHealth() {
		return health;
	}

}
