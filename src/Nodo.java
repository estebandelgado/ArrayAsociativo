
public class Nodo {

	public String clave;
	public String valor;
	public Nodo sig;
	
	public Nodo(){
		clave = "";
		valor = "";
		sig = null;
	}

	public Nodo(String cl, String vl) {
		clave = cl;
		valor = vl;
		sig = null;
	}

}
