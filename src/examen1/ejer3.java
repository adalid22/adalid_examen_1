package examen1;
import java.util.Scanner;
public class ejer3 {

	public static void main(String[] args) {
System.out.println("Ingrese numero 1: ");
Scanner S = new Scanner(System.in);
int num1; 
num1= S. nextInt();
System.out.println("Ingrese numero 2: ");
int num2;
num2= S. nextInt();
System.out.println("Ingrese numero 3: ");
int num3;
num3= S. nextInt();
/*Calculamos el promedio sumar variable y dividirlas entre la cantidad*/
int prome= prome=(num1+num2+num3)/3;
/*Usamos el if y el else if para que desarrolle la accion si se cumple la condicion*/
if (prome<500)
    
    System.out.println("Game Over");
    
else if (prome<700)    
    System.out.println("Suficiente");

else if (prome<=1000)
    System.out.println("Bueno");

else if (prome>1000)
    System.out.println("Excelente"); 
    System.out.println("Has ganado");
    {
System.out.println("Fin del juego");
	}
	}
}
