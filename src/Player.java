import race.Dwarf;
import race.Elf;
import race.Human;
import race.Orc;
import race.Race;

public class Player {
	
		public  String name;
		public int number;
		public Race PlayerRace;
		
		
		public Race getPlayerRace() {
			return PlayerRace;
		}


		public Player(String name0, int number0, Race race){
			this.name=name0;
			this.number=number0;
			this.PlayerRace=race;
		}


}
