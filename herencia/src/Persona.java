
public class Persona {
	protected String nombre, dni;

	Persona(String nombre, String dni){
		this.nombre=nombre;
		this.dni=dni;
	}
	public void mostrar(){
		System.out.println("Nombre: "+nombre +"\nDNI: "+dni);
	}
	public String toString(){
		return "\nNombre: "+nombre +"\nDNI: "+dni;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean salida=false;
		if (o!=null && o instanceof Persona){
			Persona p =(Persona) o;
			if(p.dni.equals(dni) && p.nombre.equals(nombre)) salida=true;
		}
		return salida;
	}
	
}
