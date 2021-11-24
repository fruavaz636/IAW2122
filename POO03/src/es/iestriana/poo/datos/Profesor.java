package es.iestriana.poo.datos;

import java.util.Random;

public class Profesor {

	public void ponerNotas(Alumno a) {
		a.getAsig1().setCalificacion(new Random().nextFloat()*10);
		a.getAsig2().setCalificacion(new Random().nextFloat()*10);
		a.getAsig3().setCalificacion(new Random().nextFloat()*10);
	}
	
	public double calcularMedia(Alumno a) {
		double cal1 = a.getAsig1().getCalificacion();
		double cal2 = a.getAsig2().getCalificacion();
		double cal3 = a.getAsig3().getCalificacion();
		return (cal1 + cal2 + cal3) / 3;
	}
}
