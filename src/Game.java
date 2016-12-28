import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import monster.Minotaur;
import monster.Monster;
import monster.RedDragon;
import monster.Troll;
import monster.WhiteDragon;
import monster.Vampire;
import race.Dwarf;
import race.Elf;
import race.Human;
import race.Orc;
import race.Race;

// trois choix par tour : attaquer, esquiver, fuir
public class Game {
	
	private List<Monster> MonsterList = new ArrayList<Monster>();
	Location TabLocation[] = new Location[5];
	
	
	public void CreateMonster(){
		MonsterList.add(new RedDragon());
		MonsterList.add(new Vampire());
		MonsterList.add(new WhiteDragon());
		MonsterList.add(new Minotaur());
		MonsterList.add(new Troll());
		
		TabLocation[0]=new Location("TowerOfPain");
		TabLocation[1]=new Location("OasisOfPeace");
		TabLocation[2]=new Location("DarkCastle");
		TabLocation[3]=new Location("CanyonOfDeath");
		TabLocation[4]=new Location("DarkSea");
		
		int n=0;
		for(int i=0;i<5;i++){
			Random r =  new Random();
			n = r.nextInt(5);
			TabLocation[i].setLocationMonster(MonsterList.get(n));
		}
		
	}
	
	
	public int fight(Race race,Monster monster){
		int RaceLuck, MonsterLuck;
		int RaceAttack, MonsterAttack;
		int RaceHealth=race.getHealth(), MonsterHealth=monster.getHealth();
		//TODO
		while((RaceHealth > 0)&&(MonsterHealth > 0)){
			
			RaceLuck = (race.getIntellect()+race.getAgility())*(RaceHealth/race.getHealth());
			MonsterAttack = (monster.getAttack()) - RaceLuck;
			System.out.printf("\n The monster attack with " + MonsterAttack + "damage");
			RaceHealth = RaceHealth - MonsterAttack;
			System.out.printf(" \n your health is " + RaceHealth);
			
			
			if(monster == MonsterList.get(2) || monster == MonsterList.get(4)){
				System.out.printf(" \n The monster attack two times");
				RaceLuck = (race.getIntellect()+race.getAgility()+race.getIntellect() + race.getPerception() + race.getCharisma())*(RaceHealth/race.getHealth());
				MonsterAttack = monster.getAttack() - RaceLuck;
				System.out.printf("\n The monster attack with " + MonsterAttack + "damage");
				RaceHealth = RaceHealth - MonsterAttack;
				System.out.printf(" \n your health is " + RaceHealth);
			}
			
			if(monster == MonsterList.get(1)){
				System.out.printf(" \n The monster improve his life");
				MonsterHealth = (1/4)*(monster.getAttack()) + MonsterHealth;
			}
			
			MonsterLuck = monster.getDefense() * (MonsterHealth/monster.getHealth());
			RaceAttack = (race.getAttack()+ race.getEgo() + race.getMagic() + race.getIntellect()) - MonsterLuck;
			System.out.printf("\n you attack the monster with " + RaceAttack + "damage");
			MonsterHealth = MonsterHealth - RaceAttack;
			System.out.printf(" \n the Monster Health is " + MonsterHealth);
		}
		
		if(RaceHealth <= 0){
			return(2);
		}
		else{
			return(1);
		}
		
	}
	
	public Game(){
		CreateMonster();
	}
	
	

	

}
