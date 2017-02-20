import java.util.ArrayList;


public class TestPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1=new Empleado("pepe","x90899x",10000);
		//emp1.mostrar();
		Persona p;
		Empleado e;
		Programador prog1=new Programador("Juan","x9408889a",100200,"PHP","VisualBasic","JAVA");
		System.out.println(emp1);
		System.out.println(prog1.getStringLenguajes());
		p=prog1;
		e=prog1;
		System.out.println(p);
		System.out.println(e);
		
		GestionPersonas gPer = new GestionPersonas();
		System.out.println(gPer.toString());
		
		
		System.out.println(gPer.pertenece(e));
		
		ArrayList lista = new ArrayList();
		lista.add(5);
		lista.add(8);
		
		for (int t=0;t<lista.size();t++){
			System.out.println(lista.get(t));
		}
		lista.add(0,9);
		for (int t=0;t<lista.size();t++){
			System.out.println(lista.get(t));
		}
		
		
		
	}

}
