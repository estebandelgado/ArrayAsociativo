
public class ArrayAsociativo {

	public Nodo primerNodo;

	public ArrayAsociativo() {
		primerNodo = null;
	}

	public void put(String clave, String valor) {
		if (primerNodo == null)
			primerNodo = new Nodo(clave, valor);
		else {
			Nodo current = primerNodo;
			while (current.sig != null && current.clave != clave)
				current = current.sig;
			if (clave == current.clave)
				current.valor = valor;
			else {
				current.sig = new Nodo(clave, valor);
			}
		}
	}

	public String get(String cl) {
		Nodo current = primerNodo;
		while (current.sig != null && current.clave != cl)
			current = current.sig;
		if (current.clave != cl)
			throw new RuntimeException();
		return current.valor;
	}

	public String getOrElse(String cl, String valorPorDefecto) {
		Nodo current = primerNodo;
		while (current.sig != null && current.clave != cl)
			current = current.sig;
		if (current.clave != cl)
			return valorPorDefecto;
		return current.valor;
	}

	public boolean containsKey(String cl) {
		if (primerNodo == null)
			return false;
		Nodo current = primerNodo;
		while (current.sig != null && current.clave != cl)
			current = current.sig;
		return (current.clave == cl);
	}

	public boolean remove(String cl) {
		boolean borradaConExito = false;
		if (containsKey(cl)) {
			Nodo current = primerNodo;
			Nodo anterior = null;
			while (current.sig != null && current.clave != cl) {
				anterior = current;
				current = current.sig;
			}
			if (current.sig == null) {
				primerNodo = null;
			} else
				anterior.sig = current.sig;
			if (!containsKey(cl))
				borradaConExito = true;
		}
		return borradaConExito;
	}
}
