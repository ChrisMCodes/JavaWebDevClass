/**
 * 
 * @author ChrisMCodes
 * Java Web Development
 * 9/1/2022
 * Week 1b
 *
 */

import java.util.Scanner;

public class SumCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = 0;
		float num2 = 0;
		float sumOfNums = 0;
		
		System.out.println("Find the sum of any two numbers, with accuracy up to two decimal places.");
		
		num1 = getNum(num1, sc, "Enter num1: ");
		num2 = getNum(num2, sc, "Enter num2: ");
		
		sumOfNums = num1 + num2;
		System.out.printf("\n\nThe sum of %.2f and %.2f is: %.2f\n", num1, num2, sumOfNums);
		
		
		sc.close();
	}
	
	
	public static float getNum(float num, Scanner sc, String msg) {
		boolean validNum = false;
		
		while (!validNum) {
			System.out.print(msg);
			
			try {
				num = sc.nextFloat();
			} catch (Exception e) {
				sc.next();
				System.out.println("Invalid input. Please try again");
				continue;
			}
			validNum = true;
		}
		
		return num;
	}

}
