import java.util.Calendar;
import java.util.Date;


public class AlumnoFCT extends Persona{
	public final static int MAX_HORAS=370;
	protected int horas;
	protected Date fechaFin;
	AlumnoFCT(String nombre, String dni, int horas, Date fechaFin){
		super(nombre,dni);
		this.horas=horas;
		this.fechaFin=fechaFin;
	}
	
	public boolean getEstado(){
		//Calendar fecha = new Calendar();
		//System.out.println(fecha.)
		return true;
	}
	
	
	/* 
	 * metodo getEstado que devuvelva las horas para terminar las practicas
	 */
	
}
