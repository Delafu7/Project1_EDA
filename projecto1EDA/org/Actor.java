package projecto1EDA.org;

import java.util.ArrayList;

public class Actor 
{
	private ArrayList<Peli> lista;
	private String etiqueta;
	private String nombre;
	
	public Actor(String pEtiqueta, String pNombre)
	{
		lista = new ArrayList<Peli>();
		etiqueta=pEtiqueta;
		nombre= pNombre;
	}
	public boolean comparacion(String pNombre)
	{
		return(pNombre.compareTo(this.nombre)<0);
	}

}
