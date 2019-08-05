import java.util.Scanner;


//Este fichero va emparejado con Alumno.java que es el objeto al que hace referéncia
public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		Alumno[] alum;
		
		int numAlumnos=0, numNotas=0;
			
		System.out.print("Introduzca el número de alumnos a crear: ");
		numAlumnos=teclado.nextInt();
		teclado.nextLine();
		
		alum=new Alumno[numAlumnos];
		
		for(int i=0; i<alum.length; i++)
		{
			alum[i]= new Alumno();
		}
		
		for(int i=0; i<numAlumnos; i++)
		{
			System.out.print("\nIntroduzca el nombre del alumno " + (i+1) + ": ");
			alum[i].nombre=teclado.nextLine();
			
			System.out.print("Introduzca el número de notas para el alumno " + alum[i].nombre + ": ");
			numNotas=teclado.nextInt();
			teclado.nextLine();
			
			alum[i].notas= new float[numNotas];
			
			for(int j=0; j<alum[i].notas.length; j++)
			{
				System.out.print("Introduzca la nota número " + (j+1) + " del alumno " + alum[i].nombre + ": ");
				alum[i].notas[j]=teclado.nextFloat();
				teclado.nextLine();
			}
		}
		
		for(int i=0; i<alum.length; i++)
		{
			System.out.println("\nLa nota media del alumno " + alum[i].nombre + " es: " + alum[i].calcularMedia());
		}
		
		System.out.println("\nLos datos de salida para todos los alumnos son: ");
		for(int i=0; i<alum.length; i++)
		{
			alum[i].imprimirDatos();
		}
		
		for(int i=0; i<alum.length; i++)
		{
			alum[i]=null;
		}
		System.out.println("FIN");
	}

}
