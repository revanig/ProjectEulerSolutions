//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class EvenFibonacci {

	public static void main(String[] args) {
		int limitNumber = 100000;
		int total = 0;
		
		for(int i = 2; i<limitNumber; i++){
			if(fibonacci(i)<4000000){
				if(fibonacci(i)%2==0){
					total += fibonacci(i);	
				}
				
				System.out.print(fibonacci(i) + " ");
			}
			else{
				break;
			}
			
		}
		
		System.out.println("\nTotal Even Fibonacci: " + total);

	}
	
	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
