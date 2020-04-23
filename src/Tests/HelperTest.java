package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Computer;
import Operations.Helper;

class HelperTest {

	@Test
	void testAddRam() {
		Computer c1 = new Computer("Test1", 2 ,"Ej2", "Ej3", 512);
		Computer c2 = new Computer("Test1", 22 ,"Ej2", "Ej3", 512);
		Helper.addRam(c1, 2);
		Helper.addRam(c2, 8);
		assertEquals(4, c1.getRam());
	}

}
