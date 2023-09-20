package projecto1EDA.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class LecturaEscrituraFichero 
{
	private static String pathIn= System.getProperty("user.dir");
	private static LecturaEscrituraFichero miLEF= new LecturaEscrituraFichero();
	
	public static LecturaEscrituraFichero getLecturaEscrituaFichero()
	{
		return miLEF;
	}
    public void cargarDatos()
    {
    	try {
			InputStream ficheroLectura= new FileInputStream (pathIn + File.separator+"");
			Scanner sc= new Scanner(ficheroLectura);
			String fraseFichero;
			while (sc.hasNext()){
				fraseFichero=sc.next();
				String [] listadoElementos= this.analizarFrase(fraseFichero);
			}
			sc.close();
		}
		catch(FileNotFoundException fnfe)
		{
		}
		
			
    }
    public String[] analizarFrase(String pFrase)
    {
    		String[] frasePartida=pFrase.split("###");
    		if (frasePartida.length==2){
    			for(int i=0;i<2;i++){
    				frasePartida[i]=frasePartida[i].trim();
    			}
    		}
    		else if (frasePartida.length==4){
    			for(int i=0;i<4;i++){
    				frasePartida[i]=frasePartida[i].trim();
    			}
    		}
    		else {
    			//TODO Aqui entraria si el usuario ha dado una respuesta equivocada, yo creo que seria altamante conveniente lanzar un error
    		}
    	    
    		return (frasePartida);
    		
    }
    	
}
