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
	
	@Test
	public void insertarUnSegundoParConClaveNoRepetida(){
		array.put("nombre", "luis");
		Nodo current = array.primerNodo;
		
		array.put("alumno", "esteban");
		while (current.clave != "alumno") current = current.sig;

		assertEquals(current.clave, "alumno");
		assertEquals(current.valor, "esteban");
	}
	
	@Test
	public void insertarUnSegundoParConClaveRepetida(){
		array.put("nombre", "luis");
		array.put("nombre", "esteban");
		
		assertEquals(array.primerNodo.clave, "nombre");
		assertEquals(array.primerNodo.valor, "esteban");
	}
	
	@Test
	public void buscarUnaClaveEnLaTabla(){
		array.put("nombre", "luis");
		String valor = array.get("nombre");
		assertEquals("luis", valor);
	}
	
	@Test(expected = RuntimeException.class)
	public void elevarExcepcionSiLaClaveNoExiste(){
		array.get("nombre");
		
	}
	
	@Test
	public void buscarClaveEnLaTablaGetOrElse(){
		array.put("nombre", "luis");
		String valor = array.getOrElse("nombre", "NombreDeChico");
		assertEquals("luis", valor);
	}
	
	@Test
	public void buscarClaveEnLaTablaYSiNoExisteDevolverValorPorDefectoGetOrElse(){
		array.put("nombre", "luis");
		String valor = array.getOrElse("alumno", "NombreDeChico");
		assertEquals("NombreDeChico", valor);
	}
	
	@Test
	public void devolverBooleanoParaSaberSiLaClaveExisteSinDatosEnArray(){
		boolean condicion = array.containsKey("sdfsdf");
		assertFalse(condicion);
	}
	
	@Test
	public void devolverBooleanoParaSaberSiLaClaveExiste(){
		array.put("nombre", "luis");
		boolean condicion = array.containsKey("sdfsdf");
		assertFalse(condicion);
		condicion = array.containsKey("nombre");
		assertTrue(condicion);
	}
	
	@Test
	public void borrarParConClaveEspecificada(){
		boolean entradaBorrada = array.remove("nombre");
		assertFalse(entradaBorrada);
		array.put("alumno", "esteban");
		entradaBorrada = array.remove("alumno");
		assertTrue(entradaBorrada);
		
	}
	
	@Test
	public void devolverNumeroEntradasEnArrayVacio(){
		assertEquals(0, array.size());
	}
}
