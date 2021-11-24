package es.iestriana.poo.datos;

public class Alumno {

	private Asignatura asig1;
	private Asignatura asig2;
	private Asignatura asig3;
	
	public Alumno(Asignatura asig1, Asignatura asig2, Asignatura asig3) {
		super();
		this.asig1 = asig1;
		this.asig2 = asig2;
		this.asig3 = asig3;
	}
	
	public Alumno(int id1, int id2, int id3) {
		this.asig1 = new Asignatura(id1);
		this.asig2 = new Asignatura(id2);
		this.asig3 = new Asignatura(id3);
	}

	public Asignatura getAsig1() {
		return asig1;
	}

	public Asignatura getAsig2() {
		return asig2;
	}

	public Asignatura getAsig3() {
		return asig3;
	}

	@Override
	public String toString() {
		return "Alumno [asig1=" + asig1 + ", asig2=" + asig2 + ", asig3=" + asig3 + "]";
	}
}
