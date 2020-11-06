package entities;

public class Circulo {

	final float PI = 3.1416F;
	private float raio;

	public Circulo() {

	}

	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public float getAreaCirculo(float raio) {

		return (float) (PI * Math.pow(raio, 2));
	}

	@Override
	public String toString() {
		return "Circulo: " + String.format("%.3f", getAreaCirculo(raio));
	}

	
}
