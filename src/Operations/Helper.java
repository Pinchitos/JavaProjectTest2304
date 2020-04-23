package Operations;

import Model.Computer;

public class Helper {

	public static void addRam(Computer c1, int ramToAdd) {
		c1.setRam(c1.getRam() + ramToAdd);
	}
	
	public static void substractRam(Computer c1, int ramToSubstract) {
		c1.setRam(c1.getRam() - ramToSubstract);
	}
	
	

}
