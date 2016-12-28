package race;

public class Human extends Race {
	private static final int HumanStrength = 14;
	private static final int HumanAgility = 10;
	private static final int HumanDexterity = 10;
	private static final int HumanMagic = 9;
	private static final int HumanCharisma = 12;
	private static final int HumanEndurance = 11;
	private static final int HumanPerception = 14;
	private static final int HumanIntellect = 16;
	private static final int HumanEgo = 12;
	
	public Human(){
		super(HumanStrength, HumanAgility, HumanDexterity, HumanMagic, HumanCharisma, HumanEndurance, HumanPerception, HumanIntellect, HumanEgo);
	}

}
