package testCASE;

public class javaSample {
	public static void main(String[] args) {
		palinDrome("vavs");
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
	
	public static void palinDrome(int num) {
		int temp = num;
		
		int rev = 0;
		 while (num >0) {
			 int p = num%10;
			 rev = rev*10 + p;
			 num = num /10;
		 }
		 
		 if (temp == rev) {
			 System.out.println(temp +" is Palindrome");
		 }else {
			 System.out.println(temp +" is Not Palindrome");

		 }
	}
	
	public static void palinDrome(String name) {
		boolean result = true;
		int length = name.length();
		for(int i=0; i < length/2; i++) {
			if(name.charAt(i) != name.charAt(length-i-1)) {
				result = false;
				break;
			}
		}
		 if (result) {
			 System.out.println(name +" is Palindrome");
		 }else {
			 System.out.println(name +" is Not Palindrome");

		 }
	}
	
	public static void primeNumber(int num) {
        boolean flag = false;
        int div=0;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                div=i;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number. divided by : "+div);
	}

	public static void swapTwoVariable(int num1, int num2) {
		System.out.println("Before");

		System.out.println("Num 1 : " + num1);
		System.out.println("Num 2 : " + num2);
		
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		
		System.out.println("After");

		System.out.println("Num 1 : " + num1);
		System.out.println("Num 2 : " + num2);

		
	}
}
