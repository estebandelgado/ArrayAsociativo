
public class ArrayAsociativo {

	public Nodo primerNodo;

	public ArrayAsociativo() {
		primerNodo = null;
	}

	public void put(String clave, String valor) {
		if (primerNodo == null)	primerNodo = new Nodo("nombre", "luis");
		else{
			Nodo current = primerNodo;
			while (current.sig != null && current.clave != "clave") current = current.sig;
			if (clave == current.clave) current.valor = valor;
			current.sig = new Nodo(clave, valor);
		}
	}

}
