package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Quadrado;
import entities.Retangulo;
import entities.Trapezio;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dê a entrada a três valores e calcule a área das cinco principais figuras geométricas!");
		System.out.print("Valor 1: ");
		float A = sc.nextFloat();
		System.out.print("Valor 2: ");
		float B = sc.nextFloat();
		System.out.print("Valor 3: ");
		float C = sc.nextFloat();
		
		Quadrado quadrado = new Quadrado(B);
		Triangulo triangulo = new Triangulo(A, C);
		Retangulo retangulo = new Retangulo(A, B);
		Trapezio Trapezio = new Trapezio(A, B, C);
		Circulo circulo = new Circulo(C);
		
		System.out.println();
		System.out.println(quadrado);
		System.out.println(triangulo);
		System.out.println(retangulo);
		System.out.println(Trapezio);
		System.out.println(circulo);

	}

}
