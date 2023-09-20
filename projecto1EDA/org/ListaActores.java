package projecto1EDA.org;

import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;


public class ListaActores
{
	private HashMap<String,Actor> lista;
	
	public ListaActores()
	{
		lista= new HashMap<String,Actor>();
	}
	
	public void annadirActor(Actor pActor)
	{
		if (buscarActorActriz(pActor)) {
			System.out.println("El actor/actriz escrito ya se haya annadido.");
		}
		else {
			this.lista.add(pActor);
		}
	}
	
	public HashMap<Actor> ordenarLista(ArrayList<Actor> pLista)
	{
		
	}
	public boolean buscarActorActriz(String pNombre, String pEtiqueta)
	{
		
        
		
	}
	public void delvolverPelisActor (Actor pActor)
	{
		//TODO se realizara la busqueda del actor y su lista de pelis se insertara en el fichero creado
	}
	public void borrarActor(Actor pActor)
	{
		
	}
	
	public String[] obtenerListaActoresOrdenada()
	{
		
		return( Collections.sort(this.lista));
	}
	
}
