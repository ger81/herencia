
public class Empleado extends Persona{
	protected float salario;
	
	Empleado( String nombre, String dni, float salario){
		super(nombre,dni);
		this.salario=salario;
	}
	public  void mostrar(){
		super.mostrar();
		System.out.println("Salario: "+salario);
	}
	public String toString(){
		return super.toString() + "\nSalario: "+salario;
		}
}

