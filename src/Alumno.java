
//Objeto tipo alumno para usar en Notas.java
public class Alumno {

	String nombre="NOMBRE";
	float[] notas;

	float calcularMedia()
	{
		float media=0;
		
		for(int i=0; i<notas.length; i++)
		{
			media=media+notas[i];
		}
		media=media/notas.length;
		return media;
	}
	
	void imprimirDatos()
	{
		System.out.println("\nPara el alumno " + nombre + ", las notas son: ");
		for(int i=0; i<notas.length; i++)
		{
			System.out.println(nombre + " calificación " + i + ": " + notas[i]);
		}
		System.out.println("Al mismo tiempo, para el alumno " + nombre + " la nota media es: " + calcularMedia());
	}
}
