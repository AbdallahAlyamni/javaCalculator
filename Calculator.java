import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	int firstNumber;
	int secondNumber;
	int theerdNumber;

	System.out.println("Write first numbre");
	firstNumber = Integer.parseInt(input.nextLine());

	System.out.println("Write second numbre");
	secondNumber = Integer.parseInt(input.nextLine());

	System.out.println("Write theerd numbre");
	theerdNumber = Integer.parseInt(input.nextLine());

	Addition(firstNumber,secondNumber,theerdNumber);
	Substratction(firstNumber,secondNumber,theerdNumber);
	Multiplication(firstNumber,secondNumber,theerdNumber);
	}//End main function


		//Addition function
		public static void Addition(int firstNumber , int secondNumber , int theerdNumber){
			System.out.println("Addition of number equal"+ " " + (firstNumber + secondNumber + theerdNumber));
		}//End of Addition function

		//Substratction function
		public static void Substratction(int firstNumber , int secondNumber , int theerdNumber){
			System.out.println("Substratction of number equal"+" "+(firstNumber - secondNumber - theerdNumber));
		}//End of Substratction function

		//Substratction function
		public static void Multiplication(int firstNumber , int secondNumber , int theerdNumber){
			System.out.println("Multiplication of number equal"+" "+(firstNumber * secondNumber * theerdNumber));
	}//End of Multiplication function
}//End of Calculator class