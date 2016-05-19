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

}
