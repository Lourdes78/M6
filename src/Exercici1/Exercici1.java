package Exercici1;
import java.util.Scanner;


public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola");
		Scanner scan= new Scanner(System.in);
		int a =0;
		int b =0;
		System.out.println("Entra el primer enter: ");
		a= scan.nextInt();
		System.out.println("Entra el segon enter: ");
		b= scan.nextInt();
		int r = a+b;
		System.out.println("El resultat de la operació és: " + "\n" + r);
		if(r>0 && r<=5) {
			System.out.println(1);
		}
		else if(r>5 && r<=8) {
			System.out.println(2);
		}
		else if(r>=8) {
			System.out.println(3);
		}
		else {
			System.out.println("ERROR");
		}

	}

}
