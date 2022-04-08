package testCASE;

public class javaSample {
	public static void main(String[] args) {
		Fibonacci(10);
	}
	
	public static void Fibonacci(int num) {
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		System.out.println("Fibonacci Series of "+num+" numbers:");
 
        for (int i = 1; i <= num; ++i)
        {
            System.out.println(previousNumber);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
	}

}
