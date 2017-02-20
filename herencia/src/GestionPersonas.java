import java.util.ArrayList;
import java.util.Arrays;


public class GestionPersonas {
	
	//private Persona[] personas = new Persona[4];
	private ArrayList<Persona> personas;
	GestionPersonas(){
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Pepe",  "34789099X"));
		personas.add(new Empleado("Jose",  "33548965J",2000));
		personas.add(new Programador("Carlos","26347753P",1500,"JAVA","PHP"));
		personas.add(new Persona("Mario", "35005475D"));
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for (Persona persona: personas){	
				
			s.append("\n\nTipo: "+getStringClase(persona));
			s.append(persona);
		}
		return s.toString();
	}
	
	public  boolean pertenece(Persona p){
		boolean esta=false;
		for (Persona pb : personas){
			if (pb.equals(p))esta=true;
		}
		return esta;
	}
	public int buscaPersona(String dni){
		int salida=-1;
		for( int i=0; i<personas.size() && salida==-1;i++){
			if(personas.get(i).dni.equals(dni))
				salida=i;
		}
		return salida;
	}
	public int saveOrUpdate(String dni, Persona p){
		int resultado=-1;
		int indP=buscaPersona(dni);
		
		if (indP!=-1)
			personas.remove(indP);
		personas.add(p);
		return resultado;
	}

	public static String getStringClase(Object o){
		String tipo="";
			
			if (o instanceof Programador){
				tipo="Programador";
			} else{ 
				if (o instanceof AlumnoFCT){
					tipo="Alumno";
				} else if (o instanceof Empleado){
					tipo="Empleado";
				} else {
					tipo="Persona";
				}
			}
			tipo=o.getClass().getSimpleName();

		return tipo;
		
	}

}
