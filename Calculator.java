import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter operation:");
		char sign = sc.next().charAt(0);
		double res;
		switch(sign){
		    case '+':
			res = num1+num2;
			System.out.println(res);
			break;
		    case '-':
			res = num1-num2;
			System.out.println(res);
			break;
		    case '*':
			res = num1*num2;
			System.out.println(res);
			break;
		    case '/':
			res = num1/num2;
			System.out.println(res);
			break;
		    
		    default:
			System.out.println("invalid operation");

		}
		
	}
}