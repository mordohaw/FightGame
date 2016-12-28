import java.util.Scanner;

import monster.Monster;
import race.Dwarf;
import race.Elf;
import race.Human;
import race.Orc;
import race.Race;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b=true;
		int n;
		Player p1 = null;
		Game game = new Game();
		
		System.out.printf(" \n Please enter a name:");
		String name = sc.nextLine();
		
		
		
		while(b){
			System.out.printf(" \n Please enter your Race:");
			System.out.printf("[Dwarf] [Elf]  [Human] [Orc]");
			String race = sc.nextLine();
			switch (race){
				case "Dwarf":
					b=false;
					Race Dwarf1 = new Dwarf();
					p1 = new Player(name, 1,Dwarf1);
					
					break;
			
				case "Elf":
					b=false;
					Race Elf1 = new Elf();
					p1 = new Player(name, 1,Elf1);
					break;
				case "Human":
					b=false;
					Race Human1 = new Human();
					p1 = new Player(name, 1,Human1);
					break;
				case "Orc":
					b=false;
					Race Orc1 = new Orc();
					p1 = new Player(name, 1,Orc1);
					break;
					
				default:
					b=true;
					break;
			
			}
	
		}	
		
		b=true;
		Monster monster = game.TabLocation[0].getLocationMonster();
		while(b){
			System.out.printf("\n Game created successfully ! \n Please choose a place to fight : \n");
			System.out.printf("[TowerOfPain] [OasisOfPeace]  [DarkCastle] [CanyonOfDeath] [DarkSea]");
			String place = sc.nextLine();
			
			switch (place){
				case "TowerOfPain":
					b=false;
					n=0;
					monster = game.TabLocation[n].getLocationMonster();
					System.out.printf("You will face :" + monster );
					break;
			
				case "OasisOfPeace":
					b=false;
					n=1;
					monster = game.TabLocation[n].getLocationMonster();
					System.out.printf("You will face :" + monster );
					break;
				case "DarkCastle":
					b=false;
					n=2;
					monster = game.TabLocation[n].getLocationMonster();
					System.out.printf("You will face :" + monster );
					break;
					
				case "CanyonOfDeath":
					b=false;
					n=3;
					monster = game.TabLocation[n].getLocationMonster();
					System.out.printf("You will face :" + monster );
					break;
				case "DarkSea":
					b=false;
					n=4;
					monster = game.TabLocation[n].getLocationMonster();
					System.out.printf("You will face :" + monster );
					break;
				default:
					b=true;
					break;
			
			}
		b=true;
		while(b){
			System.out.printf("\n Please make a choice \n");
			System.out.printf("[Attack] [Runaway]");
			String choice = sc.nextLine();
			
			switch (choice){
				case "Attack":
					b=false;
					int k= game.fight(p1.getPlayerRace(), monster);
					if(k == 1){
						System.out.printf("\n You win !\n");
					}
					else{
						System.out.printf("\n The monster win !\n");
					}
					break;
			
				case "Runaway":
					b=false;
					n=1;
					game.fight(p1.getPlayerRace(), monster);
					System.out.printf("\n please restart the game\n");
					break;
			
				default:
					b=true;
					break;
			
			}
	
		}		
		// TODO Auto-generated method stub

		System.out.printf("\n Game completed !");
	}

}
}
