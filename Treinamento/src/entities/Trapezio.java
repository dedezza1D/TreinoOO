package entities;

public class Trapezio extends Triangulo {

	private float baseMenor;

	public Trapezio() {

	}

	public Trapezio(float base,  float baseMenor, float altura) {
		super(base, altura);
		this.baseMenor = baseMenor;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public float getAreaTrapezio(float base, float baseMenor, float altura) {

		return ((base + baseMenor) * altura)/2;	
	}

	@Override
	public String toString() {
		return "Trapezio: " + String.format("%.3f", getAreaTrapezio(getBase(),baseMenor, getAltura()));
	}
	
	

}
