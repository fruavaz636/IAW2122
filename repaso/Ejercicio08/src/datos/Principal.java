package datos;

public class Principal {

	public static void main(String[] args) {
		Componente c1 = new Componente(111, "ordenador", "informatico", 
				400.99, 2009, 0, "WWW.AMAZON.COM", 2000);
		Componente c2 = new Componente(222, "juguete", "peluche", 
				10.99, 2008, 0, "WWW.juguetos.COM", 1000);
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.actualizarEstado();
		c2.actualizarEstado();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.incrementar();
		c2.incrementar();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c2.rebajar(10.0);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if (c1.comprobar()) {
			System.out.println("c1 web correcta");
		} else {
			System.out.println("c1 web incorrecta");
		}
		
		if (c2.comprobar()) {
			System.out.println("c2 web correcta");
		} else {
			System.out.println("c2 web incorrecta");
		}
	}

}
