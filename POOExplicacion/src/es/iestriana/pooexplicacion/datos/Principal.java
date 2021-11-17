package es.iestriana.pooexplicacion.datos;

public class Principal {

	public static void main(String[] args) {
		Caja c1 = new Caja();
		c1.setAncho(12);
		c1.setAlto(23);
		System.out.println(c1);
		
		Caja c2 = new Caja(22, 33, 44);
		System.out.println(c2);
		
		System.out.println("El volumen de c2 es " + c2.obtenerVolumen());
		
		Caja c3 = new Caja(22, 33, 44);
		if (c2.equals(c3)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintos");
		}
	}

}
