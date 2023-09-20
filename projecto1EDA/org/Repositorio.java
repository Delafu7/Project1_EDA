package projecto1EDA.org;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
public class Repositorio 
{
	private ListaPelis listaP;
	private Scanner input= new Scanner(System.in);
	private ListaActores listaAct;
	private static Repositorio miRepositorio= new Repositorio();
	
	private Repositorio()
	{
		listaP= new ListaPelis();
		listaAct= new ListaActores();
	}
	
	public static Repositorio getRepositorio()
	{
		return miRepositorio;
	}
	
	public void insertarUnNuevoActor(Actor pActor)
	{
		listaAct.annadirActor(pActor);
		
	}

	private boolean mismoNumero(String pNumero, String pNumUsuario)
	{
		return (pNumero==pNumUsuario.trim()|| pNumUsuario.trim()==pNumero+"."||pNumUsuario.trim()==pNumero+".-");
	}
	
	public void interfaz()
	{
		//TODO Metodo que actuara como el menu de opciones para el usuario
		System.out.println("Bienvenido a nuestra pagina web de gestion y administracion de actores/actrices y peliculas:\n"); 
		System.out.println("Para acceder a las posibilidades inserte el numero en cuestion: \n");
		LecturaEscrituraFichero.getLecturaEscrituaFichero().cargarDatos();
		boolean funciona=true;
		{
			System.out.println("1.-Buscar un actor/actriz\r\n"+ "2.-Insertar un nuevo actor/actriz\r\n"+ "3.-Devolver las películas de un actor\r\n"+"4.-Devolver los actores de una película\r\n"+ "5.-Modificar el año de estreno de una película\r\n"+"6.-Borrar un actor/actriz\r\n"+ "7.-Guardar la lista en un fichero\r\n"+ "8.-Obtener  una  lista  de  actores  ordenada  por  nombre  y  apellido. \r\n");
			System.out.println("Porfavor, introduzca alguna de la operacion que desee realizar:\n");
			String res= this.respuesta();
			funciona=true;
			if (this.mismoNumero("1", res)){
				System.out.println("Inserte el nombre y el apellido del actor que se desea buscar. POR FAVOR a la hora de insertarlo insertelo de esta manera: enlaceActor###nombreActor \n");
				res=this.respuesta();
				this.listaAct.buscarActorActriz(res, res);
			}
			else if (this.mismoNumero("2", res)) {
				System.out.println("Inserte un nuevo actor actriz. POR FAVOR a la hora de insertarlo insertelo de esta manera: enlaceActor###nombreActor ");
				res= this.respuesta();
			}
			else if (this.mismoNumero("3", res)) {
				System.out.println("Inserte un actor para insertar su lista de peliculas en el documento. POR FAVOR a la hora de insertarlo insertelo de esta manera: enlaceActor###nombreActor ");
				res= this.respuesta();
			}
			else if (this.mismoNumero("4", res)) {
			
			}
			else if (this.mismoNumero("5", res)) {
			
			}
			else if (this.mismoNumero("6", res)) {
			
			}
			else if (this.mismoNumero("7", res)) {
			
			}
			else if (this.mismoNumero("8", res)) {
			
			}
			else {
				funciona=false;
			
			}
		}for(int i=1;i<=5 && !funciona ; i++);
	}
	
	private String respuesta()
	{
		//TODO Este metodo enviara la respuesta del usuario
		return (input.nextLine());
		
	}
	
	 public void guardarListaEnFichero ()
	 {
		 
	 }

}
