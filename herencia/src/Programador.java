
public class Programador extends Empleado{
	protected String[] lenguajes;
	Programador(String nombre, String dni, float salario, String...lenguajes){
		super(nombre,dni,salario);
		this.lenguajes=lenguajes;
	}
	
	
	
	public String toString(){
		//String s=super.toString();
		StringBuilder s = new StringBuilder(); 
		for (String cad : lenguajes){
			s.append("\nLenguaje: "+cad);
		}
		return super.toString()+s;
	}
	public String getStringLenguajes(){
		StringBuilder s = new StringBuilder(); 
		for (String cad : lenguajes){
			s.append("\nLenguaje: "+cad);
		}
		return "\n"+s;
	}
}
