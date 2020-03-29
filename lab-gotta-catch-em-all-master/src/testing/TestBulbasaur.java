package testing;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Bulbasaur;



public class TestBulbasaur {
	@Test
	public void testCharacteristicsMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "Bulbasaur is a Grass/Poison-type Pok�mon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pok�mon in the Kanto region.";
		assertEquals(temp,p.getcharacteristics());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.getcharacteristics();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testTypeMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "POISON";
		assertEquals(temp,p.gettype());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.gettype();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEvolutionMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "IVYSAUR";
		assertEquals(temp,p.getevolution());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.getevolution();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBaseExpMethod() {
		Bulbasaur p = new Bulbasaur("AAA",4);
		String temp = "64";
		assertEquals(temp,p.getbaseExp());		
		try {
			Bulbasaur p1 = new Bulbasaur(null,0);
			temp = null;
			p1.getbaseExp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
