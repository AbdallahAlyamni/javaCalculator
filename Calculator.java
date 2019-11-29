/*
*project name : Basic java GUI Calculator.
*/

import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	int firstNumber;
	int secondNumber;
	int theerdNumber;

	System.out.println("Write first number");
	firstNumber = Integer.parseInt(input.nextLine());

	System.out.println("Write second number");
	secondNumber = Integer.parseInt(input.nextLine());

	System.out.println("Write theerd number");
	theerdNumber = Integer.parseInt(input.nextLine());

	Addition(firstNumber,secondNumber,theerdNumber);
	Substratction(firstNumber,secondNumber,theerdNumber);
	Multiplication(firstNumber,secondNumber,theerdNumber);
    division(firstNumber,secondNumber,theerdNumber);
    isqrt(firstNumber,secondNumber,theerdNumber);
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
    
    // Dividion method added by @phantom-sage 
    public static void division(int first_number, int second_number, int third_number) {
        try {
            if(second_number == 0 || third_number == 0)
                throw new ArithmeticException("Can't Division by zero");
            int result = (first_number / second_number) / third_number;
            String msg = "Division operation = ";
            String out = msg + result;
            System.out.println(out);
        } catch(ArithmeticException ae) {
            System.err.println(ae.getMessage());
        }
    }
    
    /* 
    *Sqrt method add by @phantom-sage 
    *isqrt: i==improved, sqrt==square root for numbers
    */
    public static void isqrt(int first_number, int second_number, int third_number) {
        int result = (int) (Math.sqrt(first_number + second_number + third_number));
        String msg = "Isqrt = ";
        String out = msg + result;
        System.out.println(out);
    }
    
    
}//End of Calculator class