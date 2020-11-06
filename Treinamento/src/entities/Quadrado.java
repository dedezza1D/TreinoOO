package entities;

public class Quadrado {

	private float lado;
	
	public Quadrado() {
		
	}
	
	public Quadrado(float lado) {
		this.lado = lado;
	}
	
	public float getAreaQuadrado(float lado) {
		return  (float) Math.pow(lado, 2);
	}

	@Override
	public String toString() {
		return "Quadrado: " + String.format("%.3f", getAreaQuadrado(lado));
	}
	
	
}
