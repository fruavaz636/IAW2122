package es.ies.triana.datos;

public class Principal {

	public static void main(String[] args) {
		Regalos coche = new Regalos("coche teledirigido", "matel", 2020, 56.78F, true, "coche");
		System.out.println(coche);
		
		coche.actualizarExistencias();
		
		coche.incrementarPrecio(10);
		
		coche.modificarRegalo("coche de juguete");
		
		if (coche.comprobar()) {
			System.out.println("Es un coche de este año de más de 50€");
		}
		
		System.out.println(coche);
	}

}
