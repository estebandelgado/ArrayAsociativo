import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArrayAsociativo {

	private ArrayAsociativo array;
	
	@Before
	public void init(){
		array = new ArrayAsociativo();
	}
	
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
		assertEquals(array.primerNodo, null);
	}
	
	@Test
	public void insertarPrimerNodoEnArray(){
		array.put("nombre", "luis");
		assertEquals(array.primerNodo.clave, "nombre");
		assertEquals(array.primerNodo.valor, "luis");
	}

}
