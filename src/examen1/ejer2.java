package examen1;
import java.util.Scanner;
public class ejer2 {

	public static void main(String[] args) {
		/*Ejercicio 2: Imprimir n veces una cadena de texto (5pts)
Realizar un programa donde el usuario ingresa un numero y una cadena de texto. Seguidamente, el programa imprimrá la cadena de texto la misma cantidad de veces que el numero ingresado.
Ejemplo:
Ingrese un numero: 3
Ingrese una cadena: Hola
Hola
Hola
Hola*/
		Scanner S = new Scanner(System.in);
		System.out.println("bienvenidos a la cadena de texto de Adalid");
		System.out.println("ingrese un numero");
		int x;
		x= S.nextInt();
		System.out.println("ingrese una cadena de texto");
		String a;
		a= S.next();
//colocar while para poder contar la veces de la cadena de texto//
		int potasio=0;
		while (potasio <x)
		{
			System.out.println(a);
			potasio++;
		}
			
	}

}
