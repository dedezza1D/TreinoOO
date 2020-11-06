package entities;

public class Retangulo extends Triangulo {

	public Retangulo() {

	}

	public Retangulo(float base, float altura) {
		super(base, altura);
	}

	public float getAreaRetangulo(float base, float altura) {

		return base * altura;
	}

	@Override
	public String toString() {
		return "Retangulo: " + String.format("%.3f", getAreaRetangulo(getBase(), getAltura()));
	}

	
}
