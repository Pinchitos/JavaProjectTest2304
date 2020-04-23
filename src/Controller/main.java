package Controller;

import java.util.ArrayList;

import Model.Computer;
import Operations.Helper;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Computer> array = new ArrayList<Computer>();
		
		Computer c1 = new Computer("Test1", 8 ,"Ej2", "Ej3", 512);
		Computer c2 = new Computer("Ej", 16 ,"Ej2", "Ej3", 1024);
		Computer c3 = new Computer("Ej", 32 ,"Ej2", "Ej3", 2048);
		
		array.add(c1);
		array.add(c2);
		array.add(c3);
		
		
		for (Computer computer : array) {
			
			System.out.println(computer.toString());
			
		}
		
		
		
	}

}
