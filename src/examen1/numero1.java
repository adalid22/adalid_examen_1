package examen1;
import java.util.Scanner;
public class numero1 {

	public static void main(String[] args) {
		/*Ejercicio 1: Rating de películas (5pts)
Realizar un programa en Java donde se mostrará el titulo de una película. Seguidamente, el usuario ingresará una calificación de 1 a 5 estrellas. Si el usuario ingresó 1, se imprimirá "Pésima"; 2, "Mala"; 3, "Regular"; 4, "Buena"; 5, "Exeletente"
Ejemplo:
Ingrese un rating de 1 a 5 para "The Amazing Spiderman 2": 4
Buena*/
		//crear bienvenida y crear la pregunta para el voluntario//
		System.out.println("bienvenidos a: criticos award 2014");
		System.out.println("De su calificacion para la pelicula THE AVENGERS, 1-5");
		System.out.println("1.mala, 2.medio buena, 3.buena, 4.muy buena, 5.excelente");
		//crear un switch para seleccionar la respuesta del voluntario//
		Scanner S = new Scanner(System.in);
		char pelicula= S.next().charAt(0);
		
		switch (pelicula)
		{
		case'1':
			System.out.print("pesima");
			break;
		case'2':
			System.out.print("medio buena");
			break;
		case'3':
			System.out.print("buena");
			break;
		case'4':
			System.out.print("muy buena");
			break;
		case'5':
			System.out.print("excelente");
			break;


	}
	}

}
