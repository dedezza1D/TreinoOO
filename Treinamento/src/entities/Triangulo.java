package entities;

public class Triangulo {

	private float base;
	private float altura;

	public Triangulo() {

	}

	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getAreaTriangulo(float base, float altura) {

		return (base * altura) / 2F;
	}

	@Override
	public String toString() {
		return "Triangulo = " + String.format("%.3f",getAreaTriangulo(base, altura)) ;
	}
	
	

}
