import monster.Monster;



public class Location {
	private String name;
	private Monster locationMonster;

	

	public Location(String name, Monster monster){
		this.name=name;
		this.locationMonster=monster;
		
	}
	public Location(String name){
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setLocationMonster(Monster locationMonster) {
		this.locationMonster = locationMonster;
	}
	
	public Monster getLocationMonster() {
		return locationMonster;
	}

	public void setName(String name) {
		this.name = name;
	}

}
