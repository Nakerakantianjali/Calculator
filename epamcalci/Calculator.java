package epamcalci;
/*
 * @author : Anjalimadhavi
 * 
 * 
 * */
public class Calculator {
	/*
	 * @param op1
	 * @param op2
	 * op1, op2 are integer values to be added
	 * */
	 public static int addition(int op1,int op2) {
		return op1+op2;
	}
	 /*
		 * @param op1
		 * @param op2
		 * op1, op2 are integer values to be subtracted
		 * */
	public static int subtraction(int op1,int op2 ) {
		return op1-op2;
	}
	/*
	 * @param op1
	 * @param op2
	 * op1, op2 are integer values to be multiplicated
	 * */
	public static int multilication(int op1,int op2) {
		return op1*op2;
	}
	/*
	 * @param op1
	 * @param op2
	 * op1, op2 are integer values to perform divison
	 * */
	public static int division(int op1,int op2) {
		if(op2==0) {
			return 0;
		}
		return op1/op2;
	}
	 
}
