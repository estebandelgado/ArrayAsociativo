import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayAsociativo {

	@Test
	public void crearUnNodoVacio() {
		Nodo nodo = new Nodo();
		assertEquals(nodo.clave, "");
		assertEquals(nodo.valor, "");
		assertEquals(nodo.sig, null);
	}
	
	@Test
	public void crearUnNodoConDatos(){
		Nodo nodo = new Nodo("nombre", "luis");
		assertEquals(nodo.clave, "nombre");
		assertEquals(nodo.valor, "luis");
		assertEquals(nodo.sig, null);
		
	}
	
	@Test
	public void crearUnNuevoArrayAsociativoVacio(){
		ArrayAsociativo array = new ArrayAsociativo();
		assertEquals(array.primerNodo, null);
	}

}
