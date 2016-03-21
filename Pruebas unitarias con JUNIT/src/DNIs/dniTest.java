package DNIs;

import static org.junit.Assert.*;

import org.junit.Test;

import DNIs.dni;

public class dniTest {

	@Test
	public void testLetra() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("16644911") == 'H');	
	}

	
	@Test
	public void testLetra2() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("61469411") == 'W');	
	}
	
	@Test
	public void testLetra3() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("11496416") == 'G');	
	}
	
	@Test
	public void testLetra4() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("11944661") == 'W');	
	}
	
	@Test
	public void testLetra5() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("12345678") == 'Z');	
	}
	
	
	
	
	
	@Test
	public void testLongitud() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("12345678123456434564") == ' ');
		assertTrue(s.calcularLetra("12") == ' ');
	}
	
	
	@Test
	public void testEspacios() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("123456 8") == ' ');
	}
	
	
	@Test
	public void testCeros() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("00000000") == ' ');
	}
	
	@Test
	public void testVacio() {	
		dni s = new dni();
		assertTrue(s.calcularLetra("") == ' ');
	}
		
}
