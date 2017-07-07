
import mx.middelware.com.util.Url;

public class prueba {

	public static void main(String[] args) {
		
		

	       Url maderaUsuario1 = Url.ROBLE;
	       System.out.println ("La madera elegida por el usuario es " + maderaUsuario1.toString() + "\ncon un color " +
	       maderaUsuario1.getColor() + " y con un peso específico de " + maderaUsuario1.getPesoEspecifico() + " kg/m3");
	 
	       System.out.println ("Un palet admite 2.27 m3 de volumen. A continuación el peso de los palets de las distintas maderas:");
	 
	        for ( Url tmp:  Url.values() ) {
	            System.out.println (tmp.toString() + " el palet pesa " + (2.27f*(float)tmp.getPesoEspecifico() ) + " kg");
	        }
		
		
	}

}
