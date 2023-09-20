package projecto1EDA.org;

import java.util.ArrayList;

public class Peli 
{
	private ArrayList<Actor> lista;
	private String etiqueta;
	private String nombre;
	
	public Peli(String pEtiqueta, String pNombre)
	{
		lista = new ArrayList<Actor>();
		etiqueta=pEtiqueta;
		nombre= pNombre;
	}
	
}
