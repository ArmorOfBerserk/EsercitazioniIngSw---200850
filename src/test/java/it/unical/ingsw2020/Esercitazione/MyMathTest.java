package it.unical.ingsw2020.Esercitazione;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	private static MyMath math;
	
	/*Prima di iniziare il test, viene eseguito questo codice*/
	
	@BeforeClass
	public static void prepare() {
		math = new MyMath();
	}
	
	@Test
	public void primeNumbersGeneratorWorks() {
		/*L'ASSERT DICE CHE SE METTIAMO UN NUMERO MINORE DI DUE, CI ASPETTIAMO UNA LISTA VUOTA
		(SOLO L'ARRAYLIST)*/
		assertEquals(new ArrayList<Integer>(), math.numeriPrimi(1));
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.numeriPrimi(20));
	}
	
	@Test
	public void isPrimeWork() {
		//DEVO VERIFICARE CHE SIA FALSO BRO (verifica che non sia vero)
		assertFalse(math.isPrimo(9));
		//DEVO VERIFICARE CHE SIA VERO BRO (verifica che sia vero)
		assertTrue(math.isPrimo(2));
		
		assertFalse(math.isPrimo(1));
	}
	
}
