
public class ControlDeFlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *switch(condicion) {
		 *
		 *case valor:
		 *	c�digo
		 *	c�digo
		 *	c�digo
		 *case valor2:
		 * 	c�digo
		 * 	c�digo
		 *  c�digo
		 *  break;
		 * }
		 */
		
		int dia = 2;
		String mensaje = "";
				
				switch (dia) {
				case 1:
					mensaje = "Lunes";
					break;
				case 2:
					mensaje = "Martes";
					break;
				case 3:
					mensaje = "Miercoles";
					break;
				case 4:
					mensaje = "Jueves";
					break;
				case 5:
					mensaje = "Viernes";
					break;
				case 6:
					mensaje = "Sabado";
					break;
				case 7:
					mensaje = "Domingo";
					break;
				}
		System.out.println(mensaje);
	}

}
