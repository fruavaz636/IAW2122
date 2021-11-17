package es.iestriana.poo.datos;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta("Mi nombre", "6732549543287", 2000000, 3.5);
		
		c1.setNombre("Otro nombre");
		c1.setCcc("43876598743659843");
		c1.setSaldo(3000000);
		c1.setTipoDeInteres(2.3);
		
		c1.ingresar(10000);
		c2.reintegro(3000);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
